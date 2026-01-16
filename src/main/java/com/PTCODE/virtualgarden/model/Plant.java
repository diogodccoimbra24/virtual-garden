package com.PTCODE.virtualgarden.model;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    //Attributes DC
    private PlantType plantType;
    private String status;

    //Constructor DC
    public Plant(PlantType plantType) {
        this.plantType = plantType;
        //Default value for status DC
        this.status = "healthy";
    }

    //Method to apply a product on a plant DC
    public void applyProduct(ProductType product) {

        //If no product was selected, nothing happens DC
        if(product == null){
            return;
        }

        //If the status of the plant is thirsty and we add water the status goes up to healthy DC
        //If the status is thirsty and we try to add fertilizer it will stay the same because the plant needs water and not fertilizer DC
        if ("thirsty".equals(status) && product == ProductType.WATER){

            //Update of the status
            status = "healthy";

        } else if ("thirsty".equals(status) && product == ProductType.FERTILIZER) {

            //The status will be the same DC
            status = "thirsty";
        }

        //If the status of the plant is dying and we add fertilizer it will go up to thirsty, and if we want the status  to improve to healthy we need to satisfy the requirement by adding water DC
        //If the status was dying and we try to add water, the status will be the same since the plant needs fertilizer and not water DC
        if ("dying".equals(status) && product == ProductType.FERTILIZER){

            //The status improve DC
            status = "thirsty";

        } else if ("dying".equals(status) && product == ProductType.WATER) {

            //The status stays the same DC
            status = "dying";
        }
    }

    //Method to get the info of what the plant needs (getter) DC
    public String getCareInfo() {

        if(status.equals("healthy")){
            return "No need to apply any product to this " + plantType.getCategory();

        }if (status.equals("thirsty")) {
            return "Your " + getName() + " is thirsty. Apply some " + ProductType.WATER.getName();

        }if (status.equals("dying")) {
            return "Your " + getName() + " needs to be taken care. Apply some " + ProductType.FERTILIZER.getName();
        }
        return "plant status unknown";
    }

    //Method to update the status of the plant based on the weather DC
    public void updateStatusFromWeather(double temperature) {
        double thirstyAt = plantType.getThirstyTemp();
        double dyingAt = plantType.getDyingTemp();

        if (temperature >= dyingAt) {
            status = "dying";
        } else if (temperature >= thirstyAt) {
            status = "thirsty";
        } else {
            status = "healthy";
        }
    }

    //Method to get the name of the plant (getter) DC
    public String getName() {
        return plantType.getName();
    }

    //Method to get the type of the plant (getter) DC
    public String getType() {
        return plantType.getCategory();
    }

    //to get the whole plant (getter) DC
    public PlantType getPlantType(){
        return plantType;
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
