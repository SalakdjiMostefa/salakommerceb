package com.salakommerceb.common.converter;

import com.salakommerceb.common.dto.PriceDTO;
import com.salakommerceb.server.domain.price.Price;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Prices to dto.
 */
@Component
public class PricesToDTO {

    /**
     * Transform price 2 dto price dto.
     *
     * @param price the price
     * @return the price dto
     */
    public PriceDTO transformPrice2DTO(final Price price) {

        final PriceDTO priceDTO = new PriceDTO();
        priceDTO.setId(price.getId());
        priceDTO.setOldPrice(price.getOldPrice());
        priceDTO.setNewPrice(price.getNewPrice());
        priceDTO.setStartDate(price.getStartDate());
        priceDTO.setEndDate(price.getEndDate());
        priceDTO.setProductId(price.getProduct().getId());
        return priceDTO;
    }

    /**
     * Transform prices 2 dt os list.
     *
     * @param prices the prices
     * @return the list
     */
    public List<PriceDTO> transformPrices2DTOs(final List<Price> prices) {
        final List<PriceDTO> priceDTOS = new ArrayList();
        if (CollectionUtils.isNotEmpty(prices)) {
            prices.stream().forEach(p -> priceDTOS.add(transformPrice2DTO(p)));
        }
        return priceDTOS;
    }

}
