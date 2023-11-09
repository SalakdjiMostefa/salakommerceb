package com.salakommerceb.server.service.catalog.univers;

import com.salakommerceb.common.converter.UniversToDTO;
import com.salakommerceb.common.dto.UniversDTO;
import com.salakommerceb.server.domain.univers.UniversDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Univers service.
 */
@Service
public class UniversService implements IUniversService {

    @Autowired
    private UniversDAO universDAO;

    @Autowired
    private UniversToDTO universToDTO;

    @Override
    public List<UniversDTO> getAllUniversByLevel(String level) {
        return universToDTO.transformUnivers2DTOs(universDAO.findAll());
    }
}
