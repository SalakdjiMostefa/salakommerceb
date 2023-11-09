package com.salakommerceb.server.service.catalog.subcategory;

import com.salakommerceb.common.dto.SubCategoryDTO;

import java.util.List;

/**
 * The interface Sub category service.
 */
public interface ISubCategoryService {
    /**
     * Gets all sub category by level.
     *
     * @param level the level
     * @return the all sub category by level
     */
    List<SubCategoryDTO> getAllSubCategoryByLevel(final String level);
}
