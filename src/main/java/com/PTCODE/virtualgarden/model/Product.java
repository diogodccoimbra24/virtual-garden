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

        if(plant == null) {
            System.out.println("There is no plant to apply the product.");
        }
        else {
            plant.applyProduct(this);
            System.out.println("The " + name + " was applied to the " + plant.getName());
        }
    }

    //Method to get the name of the product (getter)
    public String getName() {
        return this.name;
    }
}
