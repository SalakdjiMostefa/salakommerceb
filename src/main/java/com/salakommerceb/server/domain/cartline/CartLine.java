package com.salakommerceb.server.domain.cartline;

import com.salakommerceb.server.domain.cart.Cart;
import com.salakommerceb.server.domain.item.Item;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type Cart line.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_CARTLINE")

public class CartLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity", nullable = false, length = 50)
    private int quantity;
    @Column(name = "unitcost", length = 255)
    private double unitCost;
    @Column(name = "totalcartline", length = 255)
    private long totalCartLine;
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;
}
