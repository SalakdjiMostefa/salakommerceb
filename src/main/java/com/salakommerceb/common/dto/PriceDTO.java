package com.salakommerceb.common.dto;

import lombok.Data;

/**
 * The type Price dto.
 */
@Data
public class PriceDTO implements DataTransfertObject {

    private Long id;
    private String oldPrice;
    private String newPrice;
    private String startDate;
    private String endDate;
    private long productId;

}
