package com.salakommerceb.server.service.carts;

import com.salakommerceb.common.converter.CartToDTO;
import com.salakommerceb.common.dto.CartDTO;
import com.salakommerceb.common.dto.CartLineDTO;
import com.salakommerceb.common.dto.ItemDTO;
import com.salakommerceb.server.domain.cart.Cart;
import com.salakommerceb.server.domain.cart.CartDAO;
import com.salakommerceb.server.domain.cartline.CartLine;
import com.salakommerceb.server.domain.cartline.CartLineDAO;
import com.salakommerceb.server.domain.customer.Customer;
import com.salakommerceb.server.domain.customer.CustomerDAO;
import com.salakommerceb.server.domain.item.Item;
import com.salakommerceb.server.domain.item.ItemDAO;
import com.salakommerceb.server.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * The type Cart service.
 */
@Service
public class CartService implements ICartService {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private CartDAO cartRepository;
    @Autowired
    private CartLineDAO cartLineDAO;
    @Autowired
    private ItemDAO itemDAO;
    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private CartToDTO cartToDTO;

    @Override
    public CartDTO createCartToAnonym(List<ItemDTO> itemDTOS) {
        List<CartLine> cartLines = new ArrayList<>();
        Cart cart = new Cart();

        Customer customer = customerDAO.findById(1L).get();
        cart.setCustomer(customer);

        cart = cartRepository.save(cart);
//        cart = cartRepository.save(cart);
        Cart finalCart = cart;
        itemDTOS.forEach(itemDTO -> {
            Item item = itemDAO.findById(itemDTO.getId()).get();
            CartLine cartLine = new CartLine();
//            cartLine = cartLineDAO.save(cartLine);
            cartLines.add(cartLine);
        });
        cart.setCartLines(cartLines);
        cart.setCartDate(new Date().toString());

        cart = cartRepository.save(cart);
        return cartToDTO.transformCartToDTO(cart);
    }

    @Override
    public CartDTO joinCartToUser(CartDTO cartDTO, String email) {
        Customer customer = null;
        Cart cart = cartRepository.findById(cartDTO.getId()).get();
        cart.setCustomer(customer);
        List<CartLine> cartLines = new ArrayList<>();
        for (CartLineDTO cartLineDTO : cartDTO.getCartLineDTOS()) {
            CartLine cartLine = new CartLine();
            cartLine.setQuantity(cartLineDTO.getQuantity());
            cartLine.setUnitCost(cartLineDTO.getUnitCost());
            Item item = itemDAO.findById(cartLineDTO.getItemId()).get();
            cartLine.setItem(item);
            cartLine.setCart(cart);
            cartLine = cartLineDAO.save(cartLine);
            cartLines.add(cartLine);
        }
        cart.setCartLines(cartLines);
        cart.setCartDate(cartDTO.getCartDate());
        cart = cartRepository.saveAndFlush(cart);
        return cartToDTO.transformCartToDTO(cart);
    }



}
