package com.salakommerceb.server.domain.category;

import com.salakommerceb.server.domain.univers.Univers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * This class does all the database access for the class Category.
 *
 * @see Univers
 */
@Repository
public interface CategoryDAO extends JpaRepository<Category, Long> {

}
