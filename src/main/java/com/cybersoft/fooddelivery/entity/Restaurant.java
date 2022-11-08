package com.cybersoft.fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "image")
    private String image;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "restaurant")
    @JsonIgnore
    private Set<RestaurantReview> restaurantReviewSet;

    @OneToMany(mappedBy = "restaurant")
    @JsonIgnore
    private Set<Food> foodSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<RestaurantReview> getRestaurantReviewSet() {
        return restaurantReviewSet;
    }

    public void setRestaurantReviewSet(Set<RestaurantReview> restaurantReviewSet) {
        this.restaurantReviewSet = restaurantReviewSet;
    }

    public Set<Food> getFoodSet() {
        return foodSet;
    }

    public void setFoodSet(Set<Food> foodSet) {
        this.foodSet = foodSet;
    }

}
