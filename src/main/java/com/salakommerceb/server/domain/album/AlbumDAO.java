package com.salakommerceb.server.domain.album;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * This class does all the database access for the class Category.
 *
 * @see
 */
@Repository
public interface AlbumDAO extends JpaRepository<Album, Long> {

}
