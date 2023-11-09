package com.salakommerceb.server.domain.subcategory;

import com.salakommerceb.common.exception.CheckException;
import com.salakommerceb.server.domain.category.Category;
import com.salakommerceb.server.domain.picture.Picture;
import com.salakommerceb.server.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;

/**
 * This class represents a Category in the catalog of the YAPS company.
 * The catalog is divided into categories. Each one divided into products
 * and each product in items.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@NamedQuery(name = "SubCategory.findAll", query = "select sc from SubCategory sc")
@Table(name = "T_SUBCATEGORY")

public class SubCategory implements Serializable {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "level")
    private Long level;
    @OneToMany(mappedBy = "subCategory", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Collection<Product> products;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "picture_id", referencedColumnName = "id")
    private Picture picture;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    /**
     * Instantiates a new Sub category.
     *
     * @param id          the id
     * @param name        the name
     * @param description the description
     */
    public SubCategory(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Check data.
     *
     * @throws CheckException the check exception
     */
    @PrePersist
    @PreUpdate
    public void checkData() throws CheckException {
        if (getName() == null || "".equals(getName()))
            throw new CheckException("Invalid name");
        if (getDescription() == null || "".equals(getDescription()))
            throw new CheckException("Invalid description");
    }
}
