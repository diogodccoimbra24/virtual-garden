package com.PTCODE.virtualgarden.view;


import com.PTCODE.virtualgarden.model.Plant;
import com.PTCODE.virtualgarden.model.ProductType;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StatusController {

    @FXML private Label statusLabel;


    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
        refresh();
    }

    private void refresh() {
        if (plant == null) return;
        statusLabel.setText(plant.getStatus());
    }

    @FXML
    private void waterButtonOnAction() {
        if (plant == null) return;
        plant.applyProduct(ProductType.WATER);
        refresh();
    }

    @FXML
    private void fertilizerButtonOnAction() {
        if (plant == null) return;
        plant.applyProduct(ProductType.FERTILIZER);
        refresh();
    }

}

