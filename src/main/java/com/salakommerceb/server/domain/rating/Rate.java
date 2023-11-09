package com.salakommerceb.server.domain.rating;

import com.salakommerceb.server.domain.customer.Customer;
import com.salakommerceb.server.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


/**
 * The type Rate.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_RATE")

public class Rate implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "rating", length = 50)
    private int rating;
}
