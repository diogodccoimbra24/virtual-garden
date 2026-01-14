package com.PTCODE.virtualgarden.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CreateAccountController {
    @FXML
    public void onLoginClick(ActionEvent event) {
        SceneManager.switchScene("/fxml/login.fxml");
    }
}
