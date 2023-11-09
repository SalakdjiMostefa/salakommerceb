package com.salakommerceb.server.domain.orderline;

import com.salakommerceb.server.domain.item.Item;
import com.salakommerceb.server.domain.order.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type Order line.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_ORDERLINE")

public class OrderLine implements Serializable {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity", nullable = false, length = 50)
    private int quantity;
    @Column(name = "unitcost", length = 255)
    private double unitCost;
    @Column(name = "totalorderline", length = 255)
    private long totalOrderLine;
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

}
