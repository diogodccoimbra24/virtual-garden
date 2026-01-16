package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Plant;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


public class GardenController {

    @FXML private Label gardenNameLabel;
    @FXML private Label cityLabel;
    @FXML private ListView<String> plantsListView;

    private GardenApp app;

    public void setApp(GardenApp app){
        this.app = app;
        //fill ui when screen loads DC
        refresh();
    }

    private void refresh() {
        if (app == null) return;

        Garden g = app.getCurrentGarden();
        if (g == null) return;

        if (gardenNameLabel != null) gardenNameLabel.setText(g.getName());

        // You need Garden.getRegion() for this
        if (cityLabel != null && g.getRegion() != null) {
            cityLabel.setText(g.getRegion().getCity());
        }

        if (plantsListView != null) {
            plantsListView.getItems().clear();
            for (Plant p : g.getPlants()) {
                plantsListView.getItems().add(p.getName() + " - " + p.getStatus());
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
