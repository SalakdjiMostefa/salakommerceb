package com.salakommerceb.server.domain.order;

import com.salakommerceb.server.domain.customer.Customer;
import com.salakommerceb.server.domain.orderline.OrderLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

/**
 * The type Order.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_ORDER")

public class Order {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "orderDate", length = 255)
    private String orderDate;
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Collection<OrderLine> orderLines;
}
