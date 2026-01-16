package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Region;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateGardenController {

    @FXML
    private TextField gardenName;
    @FXML
    private TextField city;
    @FXML
    private Label ErrorLabel;

    private GardenApp app;

    //indicate whether the garden was successfully created GD
    private boolean gardenCreated = false;

    //App setter GD
    public void setApp(GardenApp app) {
        this.app = app;
    }

    public boolean isGardenCreated() {
        return gardenCreated;
    }

    @FXML
    public void CreateGardenButtonOnAction() {

        // Get user input from text fields GD
        String name = gardenName.getText();
        String cityName = city.getText();

        // Validate input GD
        if (name.isBlank() || cityName.isBlank()) {
            ErrorLabel.setText("Please fill every field!");
            return;

        }

        Region region = new Region(cityName);

        // Attempt to create the garden through the application logic GD
        boolean success = app.createGarden(name, region);

        if (success) {
            gardenCreated = true;
            Stage stage = (Stage) gardenName.getScene().getWindow();
            stage.close();

        } else {
            ErrorLabel.setText("Could not create garden!");
        }
    }
    public void exitButtonOnAction(){
        Stage stage = (Stage) gardenName.getScene().getWindow();
        stage.close();
    }

}
