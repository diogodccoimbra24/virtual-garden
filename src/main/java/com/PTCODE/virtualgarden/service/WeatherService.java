package com.PTCODE.virtualgarden.service;

//Imports DC
import com.PTCODE.virtualgarden.model.Region;
import com.PTCODE.virtualgarden.model.Weather;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherService {

    public boolean updateWeatherForRegion(Weather weather, Region region){
        try {
            if (weather == null || region == null) {
                return false;
            }

            //Get the coordinates for the city selected DC
            JSONObject loc = getLocationData(region.getCity());

            //If the API can't find the city everything stops DC
            if (loc == null) {
                return false;
            }

            //JSON results that the API will use DC
            double lat = (double) loc.get("latitude");
            double lon = (double) loc.get("longitude");

            //Store the coordinates in the gardens region DC
            region.setCoordinates(lat, lon);


            //Fetch the weather from the coordinates DC
            JSONObject current = getCurrentWeather(lat, lon);

            //If the API fails to retrieve the weather from the coordinates it stops DC
            if (current == null) {
                return false;
            }

            //JSON results that the API will use based on the Hourly Weather variables DC
            double temp = (double) current.get("temperature_2m");
            long hum = (long) current.get("relative_humidity_2m");

            //Store the temperature and humidity in the gardens region DC
            weather.setTemperature(temp);
            weather.setHumidity(hum);

            return true;

        } catch (Exception e) {
            return false;
        }

    }

    //Geocoding API call DC
    private JSONObject getLocationData(String city) throws Exception {
        //The link can't have any spaces DC
        city = city.replace(" ", "+");

        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" +
                city + "&count=1&language=en&format=json";

        HttpURLConnection conn = fetchApiResponse(urlString);
        //To check if the response code is 200 DC
        if (conn == null || conn.getResponseCode() != 200) {
            return null;
        }
        String jsonResponse = readApiResponse(conn);

        JSONParser parser = new JSONParser();
        JSONObject resultsJsonObj = (JSONObject) parser.parse(jsonResponse);

        JSONArray locationData = (JSONArray) resultsJsonObj.get("results");
        if (locationData == null || locationData.isEmpty()) {
            return null;
        }

        return (JSONObject) locationData.get(0);
    }

    //Weather forecast API call DC
    private JSONObject getCurrentWeather(double latitude, double longitude) throws Exception {
        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude +
                "&longitude=" + longitude + "&current=temperature_2m,relative_humidity_2m";

        //Check if the response code is 200 DC
        HttpURLConnection conn = fetchApiResponse(url);
        if (conn == null || conn.getResponseCode() != 200) {
            return null;
        }

        String jsonResponse = readApiResponse(conn);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(jsonResponse);

        return (JSONObject) jsonObject.get("current");
    }

    private String readApiResponse(HttpURLConnection apiConnection) throws Exception {

        StringBuilder resultJson = new StringBuilder();
        Scanner scanner = new Scanner(apiConnection.getInputStream());
        while (scanner.hasNext()) resultJson.append(scanner.nextLine());
        scanner.close();

        return resultJson.toString();
    }

    private HttpURLConnection fetchApiResponse(String urlString) throws Exception {

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        return conn;
    }
}

