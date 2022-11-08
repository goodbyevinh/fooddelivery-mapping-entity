package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_order")
public class FoodOrder {

    @Column(name = "price")
    private float price;
    @Column(name = "quality")
    private float quality;
    @Column(name = "id_promo")
    private float idPromo;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_order")
    Order order;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_food")
    Food food;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuality() {
        return quality;
    }

    public void setQuality(float quality) {
        this.quality = quality;
    }

    public float getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(float idPromo) {
        this.idPromo = idPromo;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
