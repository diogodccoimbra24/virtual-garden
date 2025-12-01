package com.PTCODE.virtualgarden.model;

public class Product {

    //Attributes
    private String name;
    private String description;
    private int effectiveness;

    //Constructor
    public Product(String name, String description, int effectiveness) {

        this.name = name;
        this.description = description;
        this.effectiveness = effectiveness;
    }

    //Method to apply a product to the plant
    public void applyToPlant(Plant plant) {

    }

    //Method to get the name of the plant (getter)
    public String getName() {
        return this.name;
    }
}
