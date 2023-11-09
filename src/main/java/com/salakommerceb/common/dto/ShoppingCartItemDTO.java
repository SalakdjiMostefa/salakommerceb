package com.salakommerceb.common.dto;

import lombok.Data;

/**
 * The type Shopping cart item dto.
 */
@Data
public class ShoppingCartItemDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    private Long itemId;
    private String itemName;
    private String productDescription;
    private int quantity;
    private double unitCost;

    /**
     * Instantiates a new Shopping cart item dto.
     *
     * @param itemId             the item id
     * @param itemName           the item name
     * @param productDescription the product description
     * @param quantity           the quantity
     * @param unitCost           the unit cost
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public ShoppingCartItemDTO(final Long itemId, final String itemName, final String productDescription, final int quantity, final double unitCost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.unitCost = unitCost;
    }

    /**
     * Gets total cost.
     *
     * @return the total cost
     */
    public double getTotalCost() {
        return quantity * unitCost;
    }
}
