package com.salakommerceb.common.dto;

import lombok.Data;

import java.util.List;

/**
 * The type Category dto.
 */
@Data
public class CategoryDTO implements DataTransfertObject {

    private Long id;
    private Long universId;
    private Long level;
    private String name;
    private String description;
    private PictureDTO pictureDTO;
    private List<SubCategoryDTO> subCategoryDTOS;

}
