package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    private static Stage stage;
    private static GardenApp app;

    public static void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    //Setter DC
    public static void setApp(GardenApp gardenApp) {
        app = gardenApp;
    }
    public static void switchScene(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(SceneManager.class.getResource(fxml));
            Parent root = loader.load();

            //Inserting GardenApp in the controller DC
            Object controller = loader.getController();

            //For Regist DC
            if (controller instanceof RegisterController) {
                ((RegisterController) controller).setApp(app);
            }

            //For login DC
            if (controller instanceof LoginController) {
                ((LoginController) controller).setApp(app);
            }

            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
