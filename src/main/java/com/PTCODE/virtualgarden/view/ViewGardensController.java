package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.model.Garden;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


import java.util.List;

public class ViewGardensController {


    @FXML
    private Label gardenName;
    @FXML
    private Label city;
    @FXML
    private VBox gardensContainer;



    private GardenApp app;



    public void setApp(GardenApp app){
        this.app = app;
        loadGardens();
    }

    public void loadGardens(){
        gardensContainer.getChildren().clear();   //clear the  vbox content

        //list of gardens the currentUser GD
        List<Garden> gardens = app.getCurrentUserGardens();

        for (Garden garden : gardens) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GardenRow.fxml"));

                AnchorPane row = loader.load();
                GardenRowController controller = loader.getController();
                controller.setData(garden, app);

                gardensContainer.getChildren().add(row);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void backButtonOnAction(){
        SceneManager.switchScene("/fxml/Menu.fxml");
    }

}
