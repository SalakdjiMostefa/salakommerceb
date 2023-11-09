package com.salakommerceb.common.dto;

import lombok.Data;

/**
 * The type Sub category dto.
 */
@Data
public class SubCategoryDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    private Long id;
    private Long catergoryId;
    private Long level;
    private String name;
    private String description;
    private PictureDTO pictureDTO;
}
