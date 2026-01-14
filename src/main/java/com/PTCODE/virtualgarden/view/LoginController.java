package com.PTCODE.virtualgarden.view;

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

    @FXML
    private Label LoginMessageLabel;
    @FXML
    private TextField usernameInput;
    @FXML
    private PasswordField passwordInput;



    public void loginButtonOnAction(ActionEvent event){

        if (usernameInput.getText().isBlank() == false && passwordInput.getText().isBlank() == false) {
            LoginMessageLabel.setText("You try to login!");

        }else {
            LoginMessageLabel.setText("Please enter username and password!");
        }
    }
    public void onSignUpClick(ActionEvent event) throws Exception{
        SceneManager.switchScene("/fxml/CreateAccount.fxml");
    }




}
