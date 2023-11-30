package com.lefortdesigns.honkytonk.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String productImage;

    @Column
    private String productName;

    @Column
    private String artistName;

    @Column
    private int artYear;

    @Column
    private String artSize;

    @Column
    private String artMaterial;

    @Column
    private boolean artCertificate;

    @Column
    private boolean artUnique;

    @Column
    private float artPrice;
}
