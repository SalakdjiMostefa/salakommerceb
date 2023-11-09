package com.salakommerceb.server.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * The interface Product dao.
 */
@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

    /**
     * Find all by sub category id list.
     *
     * @param subCatId the sub cat id
     * @return the list
     */
    List<Product> findAllBySubCategory_Id(final Long subCatId);
}
