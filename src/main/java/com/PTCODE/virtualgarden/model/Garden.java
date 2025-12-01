package com.PTCODE.virtualgarden.model;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Garden {

    //Attributes
    private String name;
    private Region region;
    private Weather weather;
    private Calendar calendar;
    private List<Plant> plants;
    private List<Notification> notifications;

    //Constructor
    public Garden(String name, Region region) {
        this.name = name;
        this.region = region;
        this.weather = new Weather(region);
        this.calendar = Calendar.getInstance();
        this.plants = new ArrayList<Plant>();
        this.notifications = new ArrayList<Notification>();
    }

    //Method to add a plant from the garden
    public void addPlant(Plant plant) {

    }

    //Method to remove a plant from the garden
    public void removePlant(Plant plant) {

    }

    //Method to Check plant status (health etc...)
    public void checkPlantStatus() {

    }

    //Method to get the info of the weather (getter)
    public Weather getWeatherInfo() {
        return this.weather;
    }

    //Method to get the plants from the garden (getter)
    public List<Plant> getPlants() {
        return this.plants;
    }

    //Method to get the name from the plant (getter)
    public String getName() {
        return this.name;
    }



}
