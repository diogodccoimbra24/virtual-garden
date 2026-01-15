
package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import javafx.fxml.FXML;

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
        SceneManager.switchScene("/fxml/CreateGarden.fxml");
    }

    @FXML
    public void viewGardenButtonOnAction(){
        SceneManager.switchScene("/fxml/ViewAllGardens.fxml");
    }
}
