package com.salakommerceb.server.service.catalog.subcategory;

import com.salakommerceb.common.converter.SubCategoriesToDTO;
import com.salakommerceb.common.dto.SubCategoryDTO;
import com.salakommerceb.server.domain.subcategory.SubCategory;
import com.salakommerceb.server.domain.subcategory.SubCategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Sub category service.
 */
@Service
public class SubCategoryService implements ISubCategoryService {

    @Autowired
    private SubCategoryDAO subCategoryDAO;

    @Autowired
    private SubCategoriesToDTO subCategoriesToDTO;

    /**
     * Gets all sub category by level.
     *
     * @param level the level
     * @return the all sub category by level
     */
    @Override
    public List<SubCategoryDTO> getAllSubCategoryByLevel(String level) {
        return subCategoriesToDTO.transformSubCategories2DTOs((List<SubCategory>) (subCategoryDAO.findAllByCategory_Id(Long.valueOf(level))));
    }
}
