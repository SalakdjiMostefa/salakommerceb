package com.salakommerceb.server.domain.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Cart dao.
 */
@Repository
public interface CartDAO extends JpaRepository<Cart, Long> {

}
