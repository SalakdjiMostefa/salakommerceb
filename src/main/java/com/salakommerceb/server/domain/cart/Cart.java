package com.salakommerceb.server.domain.cart;

import com.salakommerceb.server.domain.cartline.CartLine;
import com.salakommerceb.server.domain.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;

/**
 * The type Cart.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_CART")

public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cartDate", length = 255)
    private String cartDate;
    @OneToMany(mappedBy = "cart", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Collection<CartLine> cartLines;
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

}
