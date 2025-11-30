package com.PTCODE.virtualgarden.model;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    //Attributes
    private String name;
    private String type;
    private String status;
    private List<Product> products;

    //Constructor
    public Plant(String name, String type) {
        this.name = name;
        this.type = type;
        //Default value for status
        this.status = "healthy";
        this.products = new ArrayList<Product>();
    }

    //Method to apply a product on a plant
    public void applyProduct(Product product) {

    }

    //Method to get the info of what the plant needs (getter)
    public String getCareInfo() {

    }

    //Method to get the name of the plant (getter)
    public String getName() {
        return this.name;
    }

    //Method to get the type of the plant (getter)
    public String getType() {
        return this.type;
    }

    //Method to get the current status of the plant (getter)
    public String getStatus() {
        return this.status;
    }

    //Method to set the status of the plant (setter)
    public void setStatus(String status) {
        this.status = status;
    }

}
