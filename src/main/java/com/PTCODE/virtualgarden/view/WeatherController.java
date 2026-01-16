package com.PTCODE.virtualgarden.view;


import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Weather;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class WeatherController {

    @FXML private Label cityLabel;
    @FXML private Label temperatureLabel;
    @FXML private Label humidityLabel;
    @FXML private Label messageLabel;

    private GardenApp app;

    public void setApp(GardenApp app) {
        this.app = app;
        showCurrentValues();
    }

    //Show the current temperature DC
    private void showCurrentValues() {
        if (app == null || app.getCurrentGarden() == null) {
            if (messageLabel != null) messageLabel.setText("No garden opened.");
            return;
        }

        Garden g = app.getCurrentGarden();
        Weather w = g.getWeatherInfo();

        cityLabel.setText(g.getRegion().getCity());
        temperatureLabel.setText(String.format("%.1f °C", w.getTemperature()));
        humidityLabel.setText(String.format("%.0f %%", w.getHumidity()));
    }

    //Button to update the weather DC
    @FXML
    public void updateWeatherOnAction() {
        if (app == null) return;

        boolean ok = app.updateCurrentGardenWeather();

        if (!ok) {
            messageLabel.setText("Could not update weather.");
            return;
        }

        messageLabel.setText("Updated!");
        showCurrentValues();
    }

    //Button to close the weather DC
    @FXML
    public void closeOnAction() {
        Stage window = (Stage) cityLabel.getScene().getWindow();
        window.close();
    }
}
