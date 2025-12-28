package com.PTCODE.virtualgarden.model;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    //Attributes DC
    private String name;
    private Region region;
    private Weather weather;
    private List<Plant> plants;
    private List<Notification> notifications;

    //Constructor DC
    public Garden(String name, Region region) {
        this.name = name;
        this.region = region;
        this.weather = new Weather(region);
        this.plants = new ArrayList<Plant>();
        this.notifications = new ArrayList<Notification>();
    }

    //Method to add a plant to the garden DC
    public void addPlant(Plant plant) {
        //It will add the plant int the list "plant" DC
        if (plant == null){
            return ;
        } else {
            plants.add(plant);
        }
    }

    //Method to remove a plant from the garden DC
    public void removePlant(Plant plant) {
        //It will remove the plant from the list "plant" DC
        if (plant == null){
            return;
        } else {
            plants.remove(plant);
        }
    }

    //Method to Check plant status (health etc...) DC
    public void checkPlantStatus() {
        //in the list of plants it will check if the status of each one is healthy DC
        //if it's not then will create a notification displaying the name and type of the plant DC
        for(Plant plant : plants ){
            if(!plant.getStatus().equals("healthy")){
                Notification notification = new Notification(plant.getName(), plant.getType());
                notifications.add(notification);
            }
        }

    }

    //Method to get the info of the weather (getter) DC
    public Weather getWeatherInfo() {
        return this.weather;
    }

    //Method to get the plants from the garden (getter) DC
    public List<Plant> getPlants() {
        return this.plants;
    }

    //Method to get the name from the plant (getter) DC
    public String getName() {
        return this.name;
    }

}
