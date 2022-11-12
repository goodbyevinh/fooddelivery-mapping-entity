package com.cybersoft.fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "material")
    @JsonIgnore
    private Set<FoodMaterial> foodMaterialSet;

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

    public Set<FoodMaterial> getFoodMaterialSet() {
        return foodMaterialSet;
    }

    public void setFoodMaterialSet(Set<FoodMaterial> foodMaterialSet) {
        this.foodMaterialSet = foodMaterialSet;
    }
}
