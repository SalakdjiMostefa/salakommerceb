package com.salakommerceb.common.dto;

import java.time.LocalDate;
import java.util.Collection;


/**
 * The type Order dto with string.
 */
public final class OrderDTOWithString implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private LocalDate orderDate;
    private Collection orderLines;
    private Long customerId;

    /**
     * Instantiates a new Order dto with string.
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public OrderDTOWithString() {
    }


}
