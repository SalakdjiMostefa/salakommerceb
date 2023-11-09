package com.salakommerceb.server.domain.cartline;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Cart line dao.
 */
@Repository
public interface CartLineDAO extends JpaRepository<CartLine, Long> {

}
