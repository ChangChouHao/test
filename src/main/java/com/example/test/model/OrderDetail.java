package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue
    private Long orderItemSN;
    private String orderId;
    private String productId;
    private int quantity;
    private double standPrice;
    private double itemPrice;

    // Getters and Setters
}
