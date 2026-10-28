package com.example.webservice.Entities;

import java.time.Instant;

public class Order {
    private Long id;
    private Instant moment;
    private OrderStatus orderStatus;

    public Double totalPrice;
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Order() {}

    public Order(Long id, Instant moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
