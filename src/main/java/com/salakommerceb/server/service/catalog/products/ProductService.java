package com.salakommerceb.server.service.catalog.products;

import com.salakommerceb.common.converter.ProductToDTO;
import com.salakommerceb.common.dto.ProductDTO;
import com.salakommerceb.server.domain.product.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Product service.
 */
@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ProductToDTO productToDTO;

    @Override
    public List<ProductDTO> findAllProductsByCategoryId(final Long subCategoryId) {
        return productToDTO.transformProducts2DTOs(productDAO.findAllBySubCategory_Id(subCategoryId));
    }

    @Override
    public ProductDTO findProductsById(final long id) {
        return productToDTO.transformProduct2DTO(productDAO.findById(id).get());
    }
}
