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
        this.temperature = 0.0;
        this.humidity = 0.0;
        this.conditions = "Unknown";
        this.region = region;
    }

    //Method to update the weather (DA)
    public void updateWeather() {

        // Generate a random temperature between -2ºC and 35ºC (France climate) (DA)
        this.temperature = -2 + Math.random() * 37;

        // Generate a random humidity between 45% and 95% (DA)
        this.humidity = 45 + Math.random() * 50;


        // Average temperatures in France (DA)
        if (temperature <= 2 && humidity > 70) {
            // Very cold and humid, cold rain or rare snow (DA)
            conditions = "Cold and Rainy";
        } else if (temperature <= 5 && humidity > 80) {
            // Near freezing and humid (DA)
            conditions = "Foggy";
        } else if (humidity > 80 && temperature > 5 && temperature < 25) {
            // Mild temperature and high humidity (DA)
            conditions = "Rainy";
        } else if (temperature > 28 && humidity < 60) {
            // Very warm and dry (DA)
            conditions = "Hot and Sunny";
        } else if (temperature > 25 && humidity > 70) {
            // Warm and humid (DA)
            conditions = "Stormy";
        } else if (temperature > 15 && humidity < 70) {
            // Pleasant mild weather (DA)
            conditions = "Sunny";
        } else if (temperature < 10 && humidity < 75) {
            // Cool but not very humid (DA)
            conditions = "Cloudy";
        } else {
            // Neutral fallback for mixed mild weather (DA)
            conditions = "Partly Cloudy";
        }
    }

    //Method to get the current weather summary (getter) (DA)
    public String getWeatherSummary() {

        return "Temperature: " + String.format("%.1f", temperature) + "ºC"
                + ", Humidity: " + String.format("%.1f", humidity) + "%"
                + ", Conditions: " + conditions;
    }
}

