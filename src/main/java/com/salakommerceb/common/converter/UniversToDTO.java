package com.salakommerceb.common.converter;

import com.salakommerceb.common.dto.UniversDTO;
import com.salakommerceb.server.domain.univers.Univers;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Univers to dto.
 */
@Component
public class UniversToDTO {

    @Autowired
    private CategoriesToDTO categoriesToDTO;

    /**
     * Transform univers 2 dto univers dto.
     *
     * @param univers the univers
     * @return the univers dto
     */
//  Univers
    public UniversDTO transformUnivers2DTO(final Univers univers) {
        final UniversDTO universDTO = new UniversDTO();
        universDTO.setId(univers.getId());
        universDTO.setLevel(univers.getLevel());
        universDTO.setName(univers.getName());
        universDTO.setDescription(univers.getDescription());
        if (CollectionUtils.isNotEmpty(univers.getCategories())) {
            universDTO.setCategoryDTOS(categoriesToDTO.transformCategories2DTOs(univers.getCategories()));
        }
        return universDTO;
    }

    /**
     * Transform univers 2 dt os list.
     *
     * @param univers the univers
     * @return the list
     */
    public List<UniversDTO> transformUnivers2DTOs(final List<Univers> univers) {
        final List<UniversDTO> universDTOS = new ArrayList();
//        for (Iterator iterator = univers.iterator(); iterator.hasNext(); ) {
//            final Univers univer = (Univers) iterator.next();
//            universDTOS.add(transformUnivers2DTO(univer));
//        }

        if (CollectionUtils.isNotEmpty(univers)) {
            univers.stream().forEach(u -> universDTOS.add(transformUnivers2DTO(u)));
        }
        return universDTOS;
    }

}
