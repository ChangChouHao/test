package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    // Getters and Setters
}
