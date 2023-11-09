package com.salakommerceb.common.dto;


import lombok.Data;

/**
 * This class follows the Data Transfert Object design pattern and for that implements the
 * markup interface DataTransfertObject. It is a client view of a Product. This class only
 * transfers data from a distant service to a client.
 */
@Data
public final class ProductDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    private Long id;
    private String name;
    private String description;
    private SubCategoryDTO subCategoryDTO;
    private PriceDTO priceDTO;

    /**
     * Instantiates a new Product dto.
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public ProductDTO() {
    }

}
