package com.salakommerceb.common.converter;

import com.salakommerceb.common.dto.CartLineDTO;
import com.salakommerceb.server.domain.cartline.CartLine;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component

public class CartLinesToDTO {

    public List<CartLineDTO> transformCartLinesToDTO(Collection<CartLine> cartLines) {
        List<CartLineDTO> cartLineDTOS = new ArrayList<>();
        cartLines.forEach(cartLine -> {
            CartLineDTO cartLineDTO = transformCartLineToDTO(cartLine);
            cartLineDTOS.add(cartLineDTO);
        });
        return cartLineDTOS;
    }

    public CartLineDTO transformCartLineToDTO(CartLine cartLine) {
        CartLineDTO cartLineDTO = new CartLineDTO();

        cartLineDTO.setUnitCost(cartLine.getUnitCost());
        cartLineDTO.setItemId(cartLine.getItem().getId());
        cartLineDTO.setQuantity(cartLine.getQuantity());

        return cartLineDTO;
    }

}
