package com.PTCODE.virtualgarden;

import com.PTCODE.virtualgarden.app.GardenApp;
import com.PTCODE.virtualgarden.view.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;


public class Interface extends Application {


    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        //Creating backend DC
        GardenApp app = new GardenApp();

        //Injecting into Scene manager
        SceneManager.setStage(stage);
        SceneManager.setApp(app);

        SceneManager.switchScene("/fxml/login.fxml");
        stage.show();
    }

}
