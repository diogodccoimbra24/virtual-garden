package com.PTCODE.virtualgarden.app;

import com.PTCODE.virtualgarden.auth.AuthenticationManager;
import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Region;

public class GardenApp {

    //Attributes
    private AuthenticationManager authManager;
    private boolean isRunning;

    //Constructor
    public GardenApp() {
        //Initialization of the attributes
        this.authManager = new AuthenticationManager();
        //the app starts not running
        this.isRunning = false;
    }

    //Method to control the app
    public void startApp() {

    }

    //Method to create gardens
    public void createGarden(String name, Region region) {

    }

    //Method to delete gardens
    public void deleteGarden(Garden garden) {

    }

    //Method to open gardens
    public void openGarden(Garden garden) {

    }

    //Method to show login screen
    public void showLoginScreen() {

    }

    //Method to show main menu
    public void showMainMenu() {

    }

    //Method to logout
    public void logout() {

    }


}
