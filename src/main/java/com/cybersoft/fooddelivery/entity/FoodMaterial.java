package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_material")
public class FoodMaterial {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_food")
    Food food;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_material")
    Material material;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
