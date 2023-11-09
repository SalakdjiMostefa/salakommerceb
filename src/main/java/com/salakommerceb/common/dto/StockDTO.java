package com.salakommerceb.common.dto;

import lombok.Data;

/**
 * The type Stock dto.
 */
@Data

public class StockDTO implements DataTransfertObject {

    private long id;
    private long itemId;
    private int available;
    private int reserved;

}
