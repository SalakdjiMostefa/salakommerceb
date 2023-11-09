package com.salakommerceb.common.converter;

import com.salakommerceb.common.dto.SubCategoryDTO;
import com.salakommerceb.server.domain.subcategory.SubCategory;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Sub categories to dto.
 */
@Component
public class SubCategoriesToDTO {

    /**
     * Transform sub category 2 dto sub category dto.
     *
     * @param subCategory the sub category
     * @return the sub category dto
     */
    public SubCategoryDTO transformSubCategory2DTO(final SubCategory subCategory) {
        final SubCategoryDTO subCategoryDTO = new SubCategoryDTO();
        subCategoryDTO.setId(subCategory.getId());
        subCategoryDTO.setLevel(subCategory.getLevel());
        subCategoryDTO.setName(subCategory.getName());
        subCategoryDTO.setDescription(subCategory.getDescription());
        subCategoryDTO.setCatergoryId(subCategory.getCategory().getId());
        return subCategoryDTO;
    }

    /**
     * Transform sub categories 2 dt os list.
     *
     * @param subCategories the sub categories
     * @return the list
     */
    public List<SubCategoryDTO> transformSubCategories2DTOs(final List<SubCategory> subCategories) {
        final List<SubCategoryDTO> categoriesDTO = new ArrayList();
//        for (Iterator iterator = subCategories.iterator(); iterator.hasNext(); ) {
//            final SubCategory subCategory = (SubCategory) iterator.next();
//            categoriesDTO.add(transformSubCategory2DTO(subCategory));
//        }

        if (CollectionUtils.isNotEmpty(subCategories)) {
            subCategories.stream().forEach(sc -> categoriesDTO.add(transformSubCategory2DTO(sc)));
        }
        return categoriesDTO;
    }


}
