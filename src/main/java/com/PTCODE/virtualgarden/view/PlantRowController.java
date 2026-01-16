package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Plant;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class PlantRowController {

    @FXML private Label plantName;
    @FXML private Label status;

    private Plant plant;
    private GardenApp app;

    public void setData(Plant plant, GardenApp app) {
        this.plant = plant;
        this.app = app;

        plantName.setText(plant.getName());
        status.setText(plant.getStatus().toString());
    }

    @FXML
    private void statusButtonOnAction(){


    }

    @FXML
    private void deleteButtonOnAction() {
        app.getCurrentGarden().removePlant(plant);

        // remove UI GD
        VBox container = (VBox) plantName.getParent().getParent();
        container.getChildren().remove(plantName.getParent());
    }

}
