package com.salakommerceb.common.dto;

import lombok.Data;

import java.util.List;

/**
 * The type Univers dto.
 */
@Data
public class UniversDTO implements DataTransfertObject {

    private Long id;
    private Long level;
    private String name;
    private String description;
    private PictureDTO pictureDTO;
    private List<CategoryDTO> categoryDTOS;

}
