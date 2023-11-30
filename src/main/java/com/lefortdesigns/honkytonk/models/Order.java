package com.lefortdesigns.honkytonk.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int customerId;

    @Column
    private int productId;

    @Column
    private int categoryId;

    @Column
    private String payMethod;

    @Column
    private int paymentComplete;

}
