
package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

    private GardenApp app;

    public void setApp(GardenApp app) {
        this.app = app;
    }


    @FXML
    public void logoutButtonOnAction(){
        SceneManager.switchScene("/fxml/login.fxml");
    }

    @FXML
    public void addGardenButtonOnAction(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CreateGarden.fxml"));
            Parent root = loader.load();

            CreateGardenController controller = loader.getController();
            controller.setApp(app);

            Stage popup = new Stage();
            popup.setTitle("Create Garden");
            popup.setScene(new Scene(root));

            popup.showAndWait();

            if (controller.isGardenCreated()) {
                SceneManager.switchScene("/fxml/GardenManager.fxml");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void viewGardenButtonOnAction(){
        SceneManager.switchScene("/fxml/ViewAllGardens.fxml");
    }
}
