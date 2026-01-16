package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Plant;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlantRowController {

    @FXML private Label plantName;
    @FXML private Label status;

    private Plant plant;
    private GardenApp app;

    public void setData(Plant plant, GardenApp app) {
        this.plant = plant;
        this.app = app;

        plantName.setText(plant.getName());
        status.setText(plant.getStatus());
    }



    @FXML
    private void statusButtonOnAction(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/popupStatus.fxml"));
            Parent root = loader.load();

            StatusController controller = loader.getController();
            controller.setPlant(plant); // pass the plant

            Stage popup = new Stage();
            popup.setTitle("Plant Status");
            popup.setScene(new Scene(root));
            popup.showAndWait(); // wait until user closes

            // update the status label in this row after applying product
            status.setText(plant.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void deleteButtonOnAction() {
        app.getCurrentGarden().removePlant(plant);

        // remove UI GD
        VBox container = (VBox) plantName.getParent().getParent();
        container.getChildren().remove(plantName.getParent());
    }

}
