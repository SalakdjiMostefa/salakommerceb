package com.salakommerceb.server.domain.subcategory;

import com.salakommerceb.server.domain.univers.Univers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


/**
 * This class does all the database access for the class Category.
 *
 * @see Univers
 */
@Repository
public interface SubCategoryDAO extends JpaRepository<SubCategory, Long> {

    /**
     * Find all by category id collection.
     *
     * @param s the s
     * @return the collection
     */
    Collection<SubCategory> findAllByCategory_Id(final Long s);
}
