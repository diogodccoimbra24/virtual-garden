package com.PTCODE.virtualgarden.model;

public class Weather {

    //Attributes (DA)
    private double temperature;
    private double humidity;
    private String conditions;
    private Region region;

    //Constructor (DA)
    public Weather(Region region) {

        //Initialize with default values (DA)
        this.region = region;
        this.conditions = "Unknown";
    }

    //Method to update the weather (DA)
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    //Method to get the current weather summary (getter) (DA)
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getWeatherSummary(){
        return "Temperature: " + String.format("%.1f", temperature) + "ºC"
                + " Humidity: " + String.format("%.1f", humidity) + "%"
                + " Conditions: " + conditions;

    }
}

