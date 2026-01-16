package com.PTCODE.virtualgarden.model;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    //Attributes DC
    private String name;
    private Region region;
    private Weather weather;
    private List<Plant> plants;

    //Constructor DC
    public Garden(String name, Region region) {
        this.name = name;
        this.region = region;
        this.weather = new Weather(region);
        this.plants = new ArrayList<Plant>();
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


    //It will update the plants based on the weather DC
    public void updatePlantsByWeather() {
        double temp = weather.getTemperature();

        for (Plant plant : plants) {
            plant.updateStatusFromWeather(temp);
        }
    }


    //Method to get the info of the weather (getter) DC
    public Weather getWeatherInfo() {
        return this.weather;
    }

    //Method to display the plants from the garden (getter) DC
    public List<Plant> getPlants() {
        return this.plants;
    }

    //Method to get the name from the garden (getter) DC
    public String getName() {
        return this.name;
    }


    //Method to get the region (getter) DC
    public Region getRegion(){
        return this.region;
    }

}
