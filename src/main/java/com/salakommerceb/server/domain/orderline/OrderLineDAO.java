package com.salakommerceb.server.domain.orderline;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Order line dao.
 */
@Repository
public interface OrderLineDAO extends JpaRepository<OrderLine, Long> {


}
