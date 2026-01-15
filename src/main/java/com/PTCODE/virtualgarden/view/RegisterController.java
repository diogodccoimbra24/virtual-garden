package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;



public class RegisterController {

    //Attributes DC
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField confirmPasswordField;

    private GardenApp app;

    //App setter DC
    public void setApp(GardenApp app) {
        this.app = app;
    }

    //Register button DC
    @FXML
    public void registerButtonOnAction() {

        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirm = confirmPasswordField.getText();

        //If one the fields is not fill it will not advance DC
        if (username == null || username.isBlank() || password == null || password.isBlank()) {
            return;
        }

        //Check if the confirmed password is equal to initial password DC
        if (!password.equals(confirm)) {
            return;
        }

        //Store in variable success the username and password introduced DC
        boolean success = app.register(username, password);

        //If success is true switch scene to login DC
        if (success) {
            SceneManager.switchScene("/fxml/login.fxml");
        }
    }

    //Back to login button if the user decides to go back and not create an account DC
    public void backToLoginOnAction() {
        SceneManager.switchScene("/fxml/login.fxml");
    }

}
