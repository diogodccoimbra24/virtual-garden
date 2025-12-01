package com.PTCODE.virtualgarden.model;

public class Region {

    //Attributes
    private String name;
    private String climateType;
    private String coordinates;

    //Constructor
    public Region(String name, String climateType, String coordinates) {
        this.name = name;
        this.climateType = climateType;
        this.coordinates = coordinates;
    }

    //Method to get the weather in a specific region (getter)
    public String getWeatherData() {
        //return the climate type and the coordinates of the location
    }

    //Method to get the name of the region (getter)
    public String getName() {
        return this.name;
    }

    //Method to get the climate type (getter)
    public String getClimateType() {
        return this.climateType;
    }

    //Method to get the coordinates of the region (getter)
    public String getCoordinates() {
        return this.coordinates;
    }
}
