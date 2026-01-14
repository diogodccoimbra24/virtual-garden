package com.PTCODE.virtualgarden.auth;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationManager {

    //Attributes DC
    private List<User> users;
    private User currentUser;

    //Constructor DC
    public AuthenticationManager() {
        this.users = new ArrayList<User>();
        //no one is logged in
        this.currentUser = null;
    }

    //Method to login DC
    public boolean login(String username, String password) {
        //Goes through the list of users DC
        for (User user : users){
            //Checks if the user is already registered DC
            if (user.getUsername().equals(username) && user.checkPassword(password)){
                //Sets the state of current user to user (meaning its logged in) DC
                this.currentUser = user;
                return true;
            }
        }
        return false;
    }

    //Method to logout DC
    public void logout() {
        //To reverse the log in DC
        this.currentUser = null;
    }

    //Method to register the user DC
    public boolean registerUser(String username, String password) {
        //Goes through the list of users DC
        for (User user : users){
            //Checks if there is any username that matches the one that wants to be created DC
            if (user.getUsername().equalsIgnoreCase(username)){
                return false;
            }
        }
        //If not it creates a new user and adds to the list of users
        User newUser = new User(username, password);
        users.add(newUser);
        return true;
    }

    //Method to get the actual user (getter) DC
    public User getCurrentUser() {
        return this.currentUser;
    }


}
