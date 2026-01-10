package com.PTCODE.virtualgarden.app;

import com.PTCODE.virtualgarden.auth.AuthenticationManager;
import com.PTCODE.virtualgarden.auth.User;
import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Region;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class GardenApp {

    //Attributes DC
    private AuthenticationManager authManager;
    private Garden currentGarden;

    //Constructor DC
    public GardenApp() {
        //Initialization of the attributes
        this.authManager = new AuthenticationManager();
        this.currentGarden = null;
    }

    //Method to create gardens DC
    public boolean createGarden(String name, Region region) {
        User user = authManager.getCurrentUser();

        //To check if the user is logged in DC
        if (user == null){
            return false;
        }

        //Uses the method from Garden DC
        Garden garden = new Garden(name, region);
        user.addGarden(garden);
        return true;
    }

    //Method to delete gardens DC
    public boolean deleteGarden(Garden garden) {
        User user = authManager.getCurrentUser();

        if (user == null || garden == null){
            return false;
        }
        user.removeGarden(garden);
        return true;
    }

    //Method to get the list of the current user garden's (getter)
    public List<Garden> getCurrentUserGardens() {
        User user = authManager.getCurrentUser();
        if (user == null){
            //If there is no user logged in it will return an empty list DC
            return Collections.emptyList();
        }
        return user.getGardens();
    }

    //Method to open gardens DC
    public boolean openGarden(Garden garden) {
        User user = authManager.getCurrentUser();

        //If user is not logged in and there id no garden it's not possible to use the method to open the gardens DC
        if (user == null || garden == null){
            return false;
        }
        //If user doesn't have any garden, there is no gardens to open, he must create first DC
        if (!user.getGardens().contains(garden)){
            return false;
        }

        this.currentGarden = garden;
        return true;
    }

    //Method to close the current garden in DC
    public void closeGarden(){
        this.currentGarden = null;
    }

    //Method to get the current user (getter) DC
    public Garden getCurrentGarden(){
        return currentGarden;
    }

    //Method to show login DC
    public boolean login(String username, String password) {
        return authManager.login(username, password);
    }

    //Method to show register DC
    public void register(String username, String password){
        authManager.registerUser(username, password);
    }

    //Method to logout DC
    public void logout() {
        authManager.logout();
        currentGarden = null;
    }

    public User getCurrentUser(){
        return authManager.getCurrentUser();
    }
}
