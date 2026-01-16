package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.PlantType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddPlantController {

    private GardenApp app;

    @FXML private Button AddRose;
    @FXML private Button AddSunflower;
    @FXML private Button AddTulip;
    @FXML private Button AddCarrot;
    @FXML private Button AddPotato;
    @FXML private Button AddTomato;

    public void setApp(GardenApp app) {
        this.app = app;
    }

    // helper: adds the plant and closes popup if success
    private void addPlantToGarden(PlantType plantType) {
        if (app == null) {
            System.out.println("ERROR: app is null (setApp was not called)");
            return;
        }

        boolean success = app.addPlantToCurrentGarden(plantType);

        System.out.println("Clicked add: " + plantType + " success=" + success);

        if (success) {
            closeWindow();
        }
    }

    @FXML
    public void addRoseButtonOnAction() {
        addPlantToGarden(PlantType.ROSE);
    }

    @FXML
    public void addSunflowerButtonOnAction() {
        addPlantToGarden(PlantType.SUNFLOWER);
    }

    @FXML
    public void addTulipButtonOnAction() {
        addPlantToGarden(PlantType.TULIP);
    }

    @FXML
    public void addCarrotButtonOnAction() {
        addPlantToGarden(PlantType.CARROT);
    }

    @FXML
    public void addPotatoButtonOnAction() {
        addPlantToGarden(PlantType.POTATO);
    }

    @FXML
    public void addTomatoButtonOnAction() {
        addPlantToGarden(PlantType.TOMATO);
    }

    private void closeWindow() {
        Stage stage = (Stage) AddRose.getScene().getWindow();
        stage.close();
    }
}
