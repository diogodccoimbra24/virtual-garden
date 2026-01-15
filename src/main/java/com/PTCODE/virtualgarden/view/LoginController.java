package com.PTCODE.virtualgarden.view;

import com.PTCODE.virtualgarden.app.GardenApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;


public class LoginController  {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    private GardenApp app;

    //App setter DC
    public void setApp(GardenApp app) {
        this.app = app;
    }

    //Button to login and proceed to main manu DC
    public void loginButtonOnAction(){

        String username = usernameField.getText();
        String password = passwordField.getText();

        //If one the fields is not fill it will not advance DC
        if (username == null || username.isBlank() || password == null || password.isBlank()) {
            return;
        }

        boolean success = app.login(username, password);

        //If succes is true switch to menu scene DC
        if (success) {
            SceneManager.switchScene("/fxml/Menu.fxml");
        }
    }

    //Button to come back to Sign in page DC
    public void backToSignInOnAction() {
        SceneManager.switchScene("/fxml/CreateAccount.fxml");
    }
}
