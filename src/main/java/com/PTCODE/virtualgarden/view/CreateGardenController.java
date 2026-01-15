package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Region;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreateGardenController {

    @FXML
    private TextField gardenName;
    @FXML
    private TextField city;
    @FXML
    private Label ErrorLabel;

    private GardenApp app;
    //App setter DC
    public void setApp(GardenApp app) {
        this.app = app;
    }

    public void CreateGardenButtonOnAction() {
        String name = gardenName.getText();
        String cityName = city.getText();

        if (name.isBlank() || cityName.isBlank()) {
            ErrorLabel.setText("Please fill every field!");
            return;

        }

        Region region = new Region(cityName);
        boolean success = app.createGarden(name, region);

        if (success) {
            SceneManager.switchScene("/fxml/GardenManager.fxml");
        }
    }
    public void exitButtonOnAction(){
        SceneManager.switchScene("/fxml/login.fxml");
    }

}
