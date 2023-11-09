package com.salakommerceb.server.domain.price;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Price dao.
 */
@Repository
public interface PriceDAO extends JpaRepository<Price, Long> {

}
