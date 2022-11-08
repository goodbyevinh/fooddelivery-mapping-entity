package com.cybersoft.fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "estimate_ship")
    private String estimateShip;
    @Column(name = "deliver_address")
    private String deliverAddress;

    @ManyToOne
    @JoinColumn(name = "id_user")
    User user;

    @OneToMany(mappedBy = "order")
    @JsonIgnore
    Set<FoodOrder> foodOrderSet;
    @OneToMany(mappedBy = "order")
    @JsonIgnore
    Set<OrderStatus> orderStatusSet;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstimateShip() {
        return estimateShip;
    }

    public void setEstimateShip(String estimateShip) {
        this.estimateShip = estimateShip;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<FoodOrder> getFoodOrderSet() {
        return foodOrderSet;
    }

    public void setFoodOrderSet(Set<FoodOrder> foodOrderSet) {
        this.foodOrderSet = foodOrderSet;
    }

    public Set<OrderStatus> getOrderStatusSet() {
        return orderStatusSet;
    }

    public void setOrderStatusSet(Set<OrderStatus> orderStatusSet) {
        this.orderStatusSet = orderStatusSet;
    }
}
