package com.salakommerceb.common.dto;

import lombok.Data;

import java.util.List;


/**
 * The type Cart dto.
 */
@Data
public final class CartDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================

    private long id;
    private String CartDate;
    private List<CartLineDTO> cartLineDTOS;
    private long customerId;

    // ======================================
    // =            Constructors            =
    // ======================================

}
