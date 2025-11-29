package com.PTCODE.virtualgarden.auth;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationManager {

    //Attributes
    private List<User> users;
    private User currentUser;

    //Constructor
    public AuthenticationManager() {
        this.users = new ArrayList<User>();
        //no one is logged in
        this.currentUser = null;
    }

    //Method to login
    public boolean login(String username, String password) {

    }

    //Method to logout
    public void logout() {
        //To reverse the log in
        this.currentUser = null;
    }

    //Method to register the user
    public void registerUser(String user, String password) {

    }

    //Method to get the actual user (getter)
    public User getCurrentUser() {
        return this.currentUser;
    }


}
