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

        // Generate a random temperature between -2ºC and 35ºC (France climate)
        this.temperature = -2 + Math.random() * 37;

        // Generate a random humidity between 45% and 95%
        this.humidity = 45 + Math.random() * 50;


        // Average temperatures in France
        if (temperature <= 2 && humidity > 70) {
            // Very cold and humid, cold rain or rare snow
            conditions = "Cold and Rainy";
        } else if (temperature <= 5 && humidity > 80) {
            // Near freezing and humid
            conditions = "Foggy";
        } else if (humidity > 80 && temperature > 5 && temperature < 25) {
            // Mild temperature and high humidity
            conditions = "Rainy";
        } else if (temperature > 28 && humidity < 60) {
            // Very warm and dry
            conditions = "Hot and Sunny";
        } else if (temperature > 25 && humidity > 70) {
            // Warm and humid
            conditions = "Stormy";
        } else if (temperature > 15 && humidity < 70) {
            // Pleasant mild weather
            conditions = "Sunny";
        } else if (temperature < 10 && humidity < 75) {
            // Cool but not very humid
            conditions = "Cloudy";
        } else {
            // Neutral fallback for mixed mild weather
            conditions = "Partly Cloudy";
        }
    }

    //Method to get the current weather summary (getter)
    public String getWeatherSummary() {

        return "Temperature: " + String.format("%.1f", temperature) + "ºC"
                + ", Humidity: " + String.format("%.1f", humidity) + "%"
                + ", Conditions: " + conditions;
    }
}

