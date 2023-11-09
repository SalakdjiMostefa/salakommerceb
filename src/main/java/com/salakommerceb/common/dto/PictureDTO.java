package com.salakommerceb.common.dto;

import lombok.Data;

/**
 * The type Picture dto.
 */
@Data
public class PictureDTO implements DataTransfertObject {

    private long id;
    private String name;
    private String url;
    private long albumId;
}
