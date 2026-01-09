package com.PTCODE.virtualgarden.auth;

import com.PTCODE.virtualgarden.model.Garden;

import java.util.ArrayList;
import java.util.List;

public class User {

    //Attributes DC
    private String username;
    private String password;
    private List<Garden> gardens;

    //Constructor DC
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.gardens = new ArrayList<Garden>();
    }

    //Method to add a new garden DC
    public void addGarden(Garden garden) {
        gardens.add(garden);
    }

    //Method to remove a garden DC
    public void removeGarden(Garden garden) {
        gardens.remove(garden);
    }

    //Method to get a garden from the list (getter) DC
    public List<Garden> getGardens(){
        return this.gardens;
    }

    //Method to get the username of the user (getter) DC
    public String getUsername() {
        return this.username;
    }

    //Method to check the password of the user DC
    public boolean checkPassword(String password) {
        //If statement will check if the introduced password will match the password associated to the user DC
        if (this.password.equals(password)){
            return true;
        } else {
            return false;
        }
    }
}
