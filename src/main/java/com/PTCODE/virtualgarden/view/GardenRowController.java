package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Garden;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class GardenRowController {
    @FXML
    private Label gardenName;
    @FXML
    private Label city;

    private Garden garden;
    private GardenApp app;

    public void setData(Garden garden, GardenApp app){
        this.garden = garden;
        this.app = app;

        gardenName.setText(garden.getName());
        city.setText(garden.getRegion().getCity());
    }

    @FXML
    private void onOpenGarden(){
        app.openGarden(garden);
        SceneManager.switchScene("/fxml/GardenManager.fxml");
    }

    @FXML
    private void onDeleteGarden(){
        app.deleteGarden(garden);
        ((VBox) gardenName.getParent().getParent()).getChildren().remove(
                gardenName.getParent()
        );
    }
}
