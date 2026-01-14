package com.PTCODE.virtualgarden;

import com.PTCODE.virtualgarden.view.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;
import com.PTCODE.virtualgarden.view.MainView;


public class Interface extends Application {


    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        SceneManager.setStage(stage);
        SceneManager.switchScene("/fxml/login.fxml");
        stage.show();
    }

}
