package com.PTCODE.virtualgarden.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView {

    private Stage stage;

    public MainView(Stage stage) {
        this.stage = stage;
    }

    public void show() throws IOException {

        stage.setTitle("Virtual Garden");
        //stage.setMaximized(true);
        stage.setResizable(false);
        stage.sizeToScene();

        Image logo = new Image("logoGarden.png");
        stage.getIcons().add(logo);


        stage.show();


    }
}
