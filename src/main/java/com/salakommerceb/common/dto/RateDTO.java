package com.salakommerceb.common.dto;

import lombok.Data;


/**
 * The type Rate dto.
 */
@Data
public final class RateDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================

    private long id;
    private long product_id;
    private long customerId;
    private int rate;
    // ======================================
    // =            Constructors            =
    // ======================================

    /**
     * Instantiates a new Rate dto.
     */
    public RateDTO() {
    }

}
