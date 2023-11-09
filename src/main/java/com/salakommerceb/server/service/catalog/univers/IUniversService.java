package com.salakommerceb.server.service.catalog.univers;

import com.salakommerceb.common.dto.UniversDTO;

import java.util.List;

/**
 * The interface Univers service.
 */
public interface IUniversService {
    /**
     * Gets all univers by level.
     *
     * @param level the level
     * @return the all univers by level
     */
    List<UniversDTO> getAllUniversByLevel(String level);
}
