package com.salakommerceb.server.domain.item;

import com.salakommerceb.common.exception.CheckException;
import com.salakommerceb.server.domain.product.Product;
import com.salakommerceb.server.domain.stock.Stock;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * This class represents an Item in the catalog of the YAPS company.
 * The catalog is divided into categories. Each one divided into products
 * and each product in items.
 */
// TODO final String sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE (ID LIKE '%" + keyword + "%') OR (NAME LIKE '%" + keyword + "%')";

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
//@NamedQueries({
//        @NamedQuery(name = "Item.findAll", query = "select i from Item i"),
//        @NamedQuery(name = "Item.search", query = "select i from Item i where i.name = : keyword"),
//        @NamedQuery(name = "Item.findAllInProduct", query = "select i from Item i where i.product.id = :productId")
//})
@Table(name = "T_ITEM")
public class Item implements Serializable {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "unitCost")
    private double unitCost;
    @Column(name = "qty")
    private int qty;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne(mappedBy = "item", cascade = CascadeType.ALL)
    private Stock stock;

    /**
     * Check data.
     *
     * @throws CheckException the check exception
     */
// ======================================
    // =           Business methods         =
    // ======================================
    @PrePersist
    @PreUpdate
    public void checkData() throws CheckException {
        if (getName() == null || "".equals(getName()))
            throw new CheckException("Invalid name");
        if (getUnitCost() <= 0)
            throw new CheckException("Invalid unit cost");
        if (getProduct() == null || getProduct().getId() == null || "".equals(getProduct().getId()))
            throw new CheckException("Invalid product");
    }

}
