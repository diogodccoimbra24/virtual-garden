package com.PTCODE.virtualgarden.model;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    //Attributes DC
    private String name;
    private String type;
    private String status;
    private List<Product> products;

    //Constructor DC
    public Plant(String name, String type) {
        this.name = name;
        this.type = type;
        //Default value for status DC
        this.status = "healthy";
        this.products = new ArrayList<Product>();
    }

    //Method to apply a product on a plant DC
    public void applyProduct(Product product) {

        if(product == null){
            System.out.println("No product to apply");
            return;
        }

        products.add(product);

        //If the status of the plant is thirsty and we add water the status goes up to healthy DC
        //If the status is thirsty and we try to add fertilizer it will stay the same because the plant needs water and not fertilizer DC
        if ("thirsty".equals(status) && "water".equals(product.getName())){

            //Update of the status
            status = "healthy";
            System.out.println("Your " + name + " just became " + status + " again");

        } else if ("thirsty".equals(status) && "fertilizer".equals(product.getName())) {

            //The status will be the same DC
            status = "thirsty";
            System.out.println("Your " + name + " doesn't need fertilizer right now");
        }

        //If the status of the plant is dying and we add fertilizer it will go up to thirsty, and if we want the status  to improve to healthy we need to satisfy the requirement by adding water DC
        //If the status was dying and we try to add water, the status will be the same since the plant needs fertilizer and not water DC
        if ("dying".equals(status) && "fertilizer".equals(product.getName())){

            //The status improve DC
            status = "thirsty";
            System.out.println("Your " + name + " is currently: " + status);

        } else if ("dying".equals(status) && "water".equals(product.getName())) {

            //The status stays the same DC
            status = "dying";
            System.out.println("Your " + name + " needs something else before.");
        }
    }

    //Method to get the info of what the plant needs (getter) DC
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

    //Method to get the name of the plant (getter) DC
    public String getName() {
        return this.name;
    }

    //Method to get the type of the plant (getter) DC
    public String getType() {
        return this.type;
    }

    //Method to get the current status of the plant (getter) DC
    public String getStatus() {
        return this.status;
    }

    //Method to set the status of the plant (setter) DC
    public void setStatus(String status) {
        this.status = status;
    }

}
