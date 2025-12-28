package com.PTCODE.virtualgarden.model;

public class Product {

    //Attributes DC
    private String name;
    private String description;
    private int effectiveness;

    //Constructor DC
    public Product(String name, String description, int effectiveness) {

        this.name = name;
        this.description = description;
        this.effectiveness = effectiveness;
    }

    //Method to apply a product to the plant DC
    public void applyToPlant(Plant plant) {
        //If there is no plant it will display a message indicating that there is no plant to apply DC
        //Else it applies the product referring the name of the product and the name of the plant DC
        if(plant == null) {
            System.out.println("There is no plant to apply the product.");
        }
        else {
            plant.applyProduct(this);
            System.out.println("The " + name + " was applied to the " + plant.getName());
        }
    }

    //Method to get the name of the product (getter) DC
    public String getName() {
        return this.name;
    }
}
