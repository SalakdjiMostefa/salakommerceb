package com.salakommerceb.server.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Order dao.
 */
@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {

}
