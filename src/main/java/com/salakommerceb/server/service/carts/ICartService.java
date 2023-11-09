package com.salakommerceb.server.service.carts;

import com.salakommerceb.common.dto.CartDTO;
import com.salakommerceb.common.dto.ItemDTO;

import java.util.List;

/**
 * The interface Cart service.
 */
public interface ICartService {
    /**
     * Create cart to anonym cart dto.
     *
     * @param itemDTOS the item dtos
     * @return the cart dto
     */
    CartDTO createCartToAnonym(List<ItemDTO> itemDTOS);

    /**
     * Join cart to user cart dto.
     *
     * @param cartDTO the cart dto
     * @param email   the email
     * @return the cart dto
     */
    CartDTO joinCartToUser(CartDTO cartDTO, String email);

}
