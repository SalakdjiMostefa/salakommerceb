package com.salakommerceb.server.domain.stock;

import com.salakommerceb.server.domain.item.Item;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type Stock.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_STOCK")
public class Stock implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "available")
    private int available;
    @Column(name = "reserved")
    private int reserved;


    @OneToOne
    @JoinColumn(name = "item_id")
    private Item item;

}
