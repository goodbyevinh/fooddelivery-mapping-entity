package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "order_status")
public class OrderStatus {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_order")
    Order order;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_status")
    Status status;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
