package com.salakommerceb.server.domain.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Item dao.
 */
@Repository
public interface ItemDAO extends JpaRepository<Item, Long> {

//    List<Item> findAllInProduct(Long productId);
//
//    List<Item> search(String keyword);
}
