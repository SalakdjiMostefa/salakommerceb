package com.salakommerceb.common.converter;

import com.salakommerceb.common.dto.CategoryDTO;
import com.salakommerceb.server.domain.category.Category;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Categories to dto.
 */
@Component
public class CategoriesToDTO {

    /**
     * Transform category 2 dto category dto.
     *
     * @param category the category
     * @return the category dto
     */
    public CategoryDTO transformCategory2DTO(final Category category) {
        final CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setLevel(category.getLevel());
        categoryDTO.setName(category.getName());
        categoryDTO.setDescription(category.getDescription());
        categoryDTO.setUniversId(category.getUnivers().getId());
        return categoryDTO;
    }

    /**
     * Transform categories 2 dt os list.
     *
     * @param categories the categories
     * @return the list
     */
    public List<CategoryDTO> transformCategories2DTOs(final List<Category> categories) {
        final List<CategoryDTO> categoriesDTO = new ArrayList();
        if (CollectionUtils.isNotEmpty(categories)) {
            categories.stream().forEach(c -> categoriesDTO.add(transformCategory2DTO(c)));
        }
        return categoriesDTO;
    }

}
