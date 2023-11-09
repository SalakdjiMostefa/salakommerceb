package com.salakommerceb.server.service.catalog.products;

import com.salakommerceb.common.dto.ProductDTO;

import java.util.List;

/**
 * The interface Product service.
 */
public interface IProductService {
    /**
     * Find all products by category id list.
     *
     * @param subCategoryId the sub category id
     * @return the list
     */
    List<ProductDTO> findAllProductsByCategoryId(Long subCategoryId);

    /**
     * Find products by id product dto.
     *
     * @param id the id
     * @return the product dto
     */
    ProductDTO findProductsById(long id);
}
