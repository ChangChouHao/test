package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "OrderTable")
public class Order {
    @Id
    private String orderId;
    private String memberId;
    private double price;
    private int payStatus;

    // Getters and Setters
}
