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

        if(product == null){
            System.out.println("No product to apply");
            return;
        }

        products.add(product);

        if ("thirsty".equals(status) && "water".equals(product.getName())){

            status = "healthy";
            System.out.println("Your " + name + " just became " + status + " again");

        } else if ("thirsty".equals(status) && "fertilizer".equals(product.getName())) {

            status = "thirsty";
            System.out.println("Your " + name + " doesn't need fertilizer right now");
        }

        if ("dying".equals(status) && "fertilizer".equals(product.getName())){

            status = "thirsty";
            System.out.println("Your " + name + " is currently: " + status);

        } else if ("dying".equals(status) && "water".equals(product.getName())) {

            status = "dying";
            System.out.println("Your " + name + " needs something else before.");
        }
    }

    //Method to get the info of what the plant needs (getter)
    public String getCareInfo() {

        if(status.equals("healthy")){
            return "No need to apply any product to this plant";

        }if (status.equals("thirsty")) {
            return "Your " + name + " is thirsty. Apply some water";

        }if (status.equals("dying")) {
            return "Your " + name + " needs to be taken care. Apply some fertilizer";
        }

        return "plant status unknown";
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
