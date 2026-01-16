package com.PTCODE.virtualgarden.model;

public class Weather {

    //Attributes (DA)
    private double temperature;
    private double humidity;
    private Region region;

    //Constructor (DA)
    public Weather(Region region) {

        //Initialize with default values (DA)
        this.region = region;
    }

    //Method to update the weather (DA)
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

}

