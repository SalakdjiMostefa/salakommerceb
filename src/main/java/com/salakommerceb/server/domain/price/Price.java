package com.salakommerceb.server.domain.price;

import com.salakommerceb.server.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type Price.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name = "T_PRICE")
public class Price implements Serializable {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "old_price", length = 50)
    private String oldPrice;
    @Column(name = "new_price", nullable = false, length = 50)
    private String newPrice;

    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
