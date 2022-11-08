package com.cybersoft.fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private int price;
    @ManyToOne
    @JoinColumn(name = "id_category")
    Category category;
    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    Restaurant restaurant;

    @OneToOne(mappedBy = "food")
    private FoodDetail foodDetail;

    @OneToMany(mappedBy = "food")
    @JsonIgnore
    private Set<FoodReview> foodReviews;

    @OneToMany(mappedBy = "food")
    @JsonIgnore
    private Set<FoodAddon> foodAddonSet ;

    @OneToMany(mappedBy = "food")
    @JsonIgnore
    private Set<FoodMaterial> foodMaterialSet;

    @OneToMany(mappedBy = "food")
    @JsonIgnore
    private Set<FoodOrder> foodOrderSet;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public FoodDetail getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(FoodDetail foodDetail) {
        this.foodDetail = foodDetail;
    }

    public Set<FoodReview> getFoodReviews() {
        return foodReviews;
    }

    public void setFoodReviews(Set<FoodReview> foodReviews) {
        this.foodReviews = foodReviews;
    }

    public Set<FoodAddon> getFoodAddonSet() {
        return foodAddonSet;
    }

    public void setFoodAddonSet(Set<FoodAddon> foodAddonSet) {
        this.foodAddonSet = foodAddonSet;
    }

    public Set<FoodMaterial> getFoodMaterialSet() {
        return foodMaterialSet;
    }

    public void setFoodMaterialSet(Set<FoodMaterial> foodMaterialSet) {
        this.foodMaterialSet = foodMaterialSet;
    }

    public Set<FoodOrder> getFoodOrderSet() {
        return foodOrderSet;
    }

    public void setFoodOrderSet(Set<FoodOrder> foodOrderSet) {
        this.foodOrderSet = foodOrderSet;
    }
}
