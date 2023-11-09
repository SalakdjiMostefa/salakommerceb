package com.salakommerceb.server.domain.album;

import com.salakommerceb.server.domain.picture.Picture;
import com.salakommerceb.server.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * The type Album.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@NamedQuery(name = "Album.findAll", query = "select a from Album a")
@Table(name = "T_ALBUM")

public class Album implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "description", nullable = false, length = 50)
    private String description;
    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Picture> pictures;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
