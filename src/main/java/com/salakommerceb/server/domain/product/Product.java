package com.salakommerceb.server.domain.product;

import com.salakommerceb.server.domain.album.Album;
import com.salakommerceb.server.domain.item.Item;
import com.salakommerceb.server.domain.price.Price;
import com.salakommerceb.server.domain.rating.Rate;
import com.salakommerceb.server.domain.subcategory.SubCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * The type Product.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@NamedQueries({
//        @NamedQuery(name = "Product.findAll", query = "select p from Product p"),
//        @NamedQuery(name = "Product.findAllInSubCategory", query = "select p from Product p where p.subCategory.id = :subCategoryId")
//})
@Table(name = "T_PRODUCT")
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "description", length = 255)
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subcategory_id", nullable = false)
    private SubCategory subCategory;
    @OneToMany(mappedBy = "product")
    private List<Item> items;
    @OneToMany(mappedBy = "product")
    private List<Rate> rates;
    @OneToMany(mappedBy = "product")
    private List<Album> albums;
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<Price> prices;


}
