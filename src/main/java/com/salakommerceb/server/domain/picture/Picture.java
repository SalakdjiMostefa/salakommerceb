package com.salakommerceb.server.domain.picture;

import com.salakommerceb.server.domain.album.Album;
import com.salakommerceb.server.domain.subcategory.SubCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type Picture.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@NamedQuery(name = "Picture.findAll", query = "select p from Picture p")
@Table(name = "T_PICTURE")

public class Picture implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "url", length = 255)
    private String url;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "album_id")
    private Album album;
    @OneToOne(mappedBy = "picture")
    private SubCategory subCategory;

}
