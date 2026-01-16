package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Plant;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class GardenController {

    @FXML private Label gardenNameLabel;
    @FXML private Label cityLabel;
    @FXML private VBox plantContainer;

    private GardenApp app;

    public void setApp(GardenApp app){
        this.app = app;
        //fill ui when screen loads DC
        updateUI();
    }

    private void updateUI() {
        if (app == null) return;

        Garden g = app.getCurrentGarden(); // Get the currently selected garden
        if (g == null) return;

        if (gardenNameLabel != null) gardenNameLabel.setText(g.getName());  // Update the garden name label

        if (cityLabel != null && g.getRegion() != null) {          // Update the city label if region is available
            cityLabel.setText(g.getRegion().getCity());
        }
        plantContainer.getChildren().clear();

        // Dynamically load each plant into the VBox
        for (Plant plant : g.getPlants()) {
            try {
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/fxml/PlantRow.fxml")
                );

                AnchorPane row = loader.load();             // Load the row UI GD
                PlantRowController controller = loader.getController();      // Get the row controller
                controller.setData(plant, app);

                plantContainer.getChildren().add(row);   // Add the row to the VBox

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //Button to come back to main menu DC
    public void menuButtonOnAction() {
        SceneManager.switchScene("/fxml/Menu.fxml");
    }

    //Button to check the weather DC
    public void weatherButtonOnAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Weather.fxml"));
            Parent root = loader.load();

            //Pass the GardenApp fot the controller of the popup DC
            WeatherController controller = loader.getController();
            controller.setApp(app);

            Stage popup = new Stage();
            popup.setTitle("Check weather");
            popup.setScene(new Scene(root));
            popup.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void storeButtonOnAction() {
        SceneManager.switchScene("/fxml/AddPlant.fxml");
    }

    //Button to delete garden DC
    public void deleteButtonOnAction() {

        boolean ok = app.deleteGarden(app.getCurrentGarden());
        if (ok) {
            app.closeGarden();
            SceneManager.switchScene("/fxml/Menu.fxml");
        }
    }
}
