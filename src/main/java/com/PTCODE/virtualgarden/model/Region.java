package com.PTCODE.virtualgarden.model;

public class Region {

    //Attributes (DA)
    private String city;
    private double latitude;
    private double longitude;

    //Constructor (DA)
    // to create a region the user must tell us where it is and what climate it has (DA)
    public Region(String city) {
        this.city = city;
        this.latitude = Double.NaN;
        this.longitude = Double.NaN;
    }

    //Method to get the weather in a specific region (getter) (DA)
    public String getCity() {
        return city;
        //return the climate type and the coordinates of the location
    }

    //Getter for the region name (DA)
    public double getLatitude() {

        return latitude;
    }

    //Getter for the climate type (DA)
    public double getLongitude() {
        return longitude;
    }

    //Getter for the region coordinates (DA)
    public void setCoordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;

    }

}
