package com.salakommerceb.common.dto;

import lombok.Data;

import java.util.Collection;

/**
 * The type Album dto.
 */
@Data

public class AlbumDTO implements DataTransfertObject {

    private long id;
    private String name;
    private String description;
    private Collection<PictureDTO> picturesDtos;
    private long productId;

}
