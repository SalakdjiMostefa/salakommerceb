package com.salakommerceb.common.converter;

import com.salakommerceb.common.dto.PriceDTO;
import com.salakommerceb.common.dto.ProductDTO;
import com.salakommerceb.server.domain.product.Product;
import com.salakommerceb.server.domain.subcategory.SubCategory;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Product to dto.
 */
@Component
public class ProductToDTO {

    @Autowired
    private CategoriesToDTO categoriesToDTO;

    @Autowired
    private SubCategoriesToDTO subCategoriesToDTO;

    @Autowired
    private PricesToDTO pricesToDTO;

    /**
     * Transform product 2 dto product dto.
     *
     * @param product the product
     * @return the product dto
     */
    public ProductDTO transformProduct2DTO(final Product product) {
        final ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());

        SubCategory subCategory = product.getSubCategory();
        productDTO.setSubCategoryDTO(subCategoriesToDTO.transformSubCategory2DTO(subCategory));

        List<PriceDTO> priceDTOS = pricesToDTO.transformPrices2DTOs(product.getPrices());
        PriceDTO priceDTO = getValidePriceDTO(priceDTOS);
        productDTO.setPriceDTO(priceDTO);
        return productDTO;
    }


    /**
     * Transform products 2 dt os list.
     *
     * @param products the products
     * @return the list
     */
    public List<ProductDTO> transformProducts2DTOs(final List<Product> products) {
        final List<ProductDTO> productsDTO = new ArrayList();

        if (CollectionUtils.isNotEmpty(products)) {
            products.stream().forEach(p -> productsDTO.add(transformProduct2DTO(p)));
        }

        return productsDTO;
    }

    private PriceDTO getValidePriceDTO(List<PriceDTO> priceDTOS) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate now = LocalDate.now();
        for (PriceDTO priceDTO : priceDTOS) {
            if ((Objects.nonNull(priceDTO.getStartDate()) && LocalDate.parse(priceDTO.getStartDate(), formatter).isBefore(now))
                    && (Objects.nonNull(priceDTO.getStartDate()) && LocalDate.parse(priceDTO.getEndDate(), formatter).isAfter(now))) {
                return priceDTO;
            }
        }
        return priceDTOS.get(0);

    }

}
