package com.salakommerceb.common.converter;

import com.salakommerceb.common.dto.CartDTO;
import com.salakommerceb.common.dto.CartLineDTO;
import com.salakommerceb.server.domain.cart.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartToDTO {

    @Autowired
    private CartLinesToDTO cartLinesToDTO;

    public CartDTO transformCartToDTO(Cart cart) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setCustomerId(cart.getCustomer().getId());
        cartDTO.setCartDate(cart.getCartDate());
        cartDTO.setId(cart.getId());
        List<CartLineDTO> cartLineDTOS = cartLinesToDTO.transformCartLinesToDTO(cart.getCartLines());
        cartDTO.setCartLineDTOS(cartLineDTOS);

        return cartDTO;
    }

}
