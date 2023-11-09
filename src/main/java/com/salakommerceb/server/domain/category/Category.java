package com.salakommerceb.server.domain.category;

import com.salakommerceb.common.exception.CheckException;
import com.salakommerceb.server.domain.subcategory.SubCategory;
import com.salakommerceb.server.domain.univers.Univers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

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
//@NamedQuery(name = "Category.findAll", query = "select c from Category c")
@Table(name = "T_CATEGORY")

public class Category implements Serializable {

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
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<SubCategory> subCategories;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "univers_id", nullable = false)
    private Univers univers;

    /**
     * Instantiates a new Category.
     *
     * @param id          the id
     * @param name        the name
     * @param description the description
     */
    public Category(Long id, String name, String description) {
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
