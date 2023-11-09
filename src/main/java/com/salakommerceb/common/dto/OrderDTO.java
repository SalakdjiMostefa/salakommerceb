package com.salakommerceb.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;


/**
 * The type Order dto.
 */
@Getter
@Setter
public final class OrderDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private String orderDate;
    private Collection orderLines;
    private Long customerId;

    /**
     * Instantiates a new Order dto.
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public OrderDTO() {
    }


}
