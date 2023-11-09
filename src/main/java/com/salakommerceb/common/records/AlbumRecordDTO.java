package com.salakommerceb.common.records;

import com.salakommerceb.common.dto.PictureDTO;

import java.util.Collection;


/**
 * The type Album record dto.
 */
public record AlbumRecordDTO(long id, String name, String description, Collection<PictureDTO> picturesDtos,
                             long productId) {
}
