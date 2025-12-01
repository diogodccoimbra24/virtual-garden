package com.PTCODE.virtualgarden.auth;

import com.PTCODE.virtualgarden.model.Garden;

import java.util.ArrayList;
import java.util.List;

public class User {

    //Attributes
    private String username;
    private String password;
    private List<Garden> gardens;

    //Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.gardens = new ArrayList<Garden>();
    }

    //Method to add a new garden
    public void addGarden(Garden garden) {

    }

    //Method to remove a garden
    public void removeGarden(Garden garden) {

    }

    //Method to get a garden from the list (getter)
    public List<Garden> getGardens(){
        return this.gardens;
    }

    //Method to get the username of the user (getter)
    public String getUsername() {
        return this.username;
    }

    //Method to check the password of the user
    public boolean checkPassword(String password) {

    }
}
