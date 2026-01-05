package com.PTCODE.virtualgarden.model;

public class Region {

    //Attributes (DA)
    private String name;
    private String climateType;
    private String coordinates;

    //Constructor (DA)
    // to create a region the user must tell us where it is and what climate it has (DA)
    public Region(String name, String climateType, String coordinates) {
        this.name = name;
        this.climateType = climateType;
        this.coordinates = coordinates;
    }

    //Method to get the weather in a specific region (getter) (DA)
    public String getWeatherData() {
        return "Climate Type: "  + climateType + ", Coordinates: " + coordinates;
        //return the climate type and the coordinates of the location
    }

    //Getter for the region name (DA)
    public String getName() {

        return this.name;
    }

    //Getter for the climate type (DA)
    public String getClimateType() {
        return this.climateType;
    }

    //Getter for the region coordinates (DA)
    public String getCoordinates() {

        return this.coordinates;
    }
}
