package com.PTCODE.virtualgarden.model;

public class Weather {

    //Attributes
    private double temperature;
    private double humidity;
    private String conditions;
    private Region region;

    //Constructor
    public Weather(Region region) {

        //Initialize with default values
        this.temperature = 0.0;
        this.humidity = 0.0;
        this.conditions = "Unknown";
        this.region = region;
    }

    //Method to update the weather
    public void updateWeather() {

    }

    //Method to get the current weather summary (getter)
    public String getWeatherSummary() {
        //full report of the weather including: temperature, humidity and conditions
    }

}
