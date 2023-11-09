package com.salakommerceb.common.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * This class follows the Data Transfert Object design pattern and for that implements the
 * markup interface DataTransfertObject. It is a client view of an Order Line. This class only
 * transfers data from a distant service to a client.
 */
@Getter
@Setter
public final class OrderLineDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    private int quantity;
    private double unitCost;
    private Long itemId;
    private String itemName;

    /**
     * Instantiates a new Order line dto.
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public OrderLineDTO() {
    }

    /**
     * Instantiates a new Order line dto.
     *
     * @param quantity the quantity
     * @param unitCost the unit cost
     */
    public OrderLineDTO(final int quantity, final double unitCost) {
        setQuantity(quantity);
        setUnitCost(unitCost);
    }

    @Override
    public String toString() {
        String sb = "OrderLineDTO{" + "quantity=" + quantity +
                ", unitCost=" + unitCost +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                '}';
        return sb;
    }
}
