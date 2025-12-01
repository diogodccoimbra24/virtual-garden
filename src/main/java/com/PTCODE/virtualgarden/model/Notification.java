package com.PTCODE.virtualgarden.model;

import java.time.LocalDate;

public class Notification {

    //Attributes
    private String message;
    private String type;
    private LocalDate date;

    //Constructor
    public Notification(String message, String type) {
        this.message = message;
        this.type = type;
        //it will show the current date
        this.date = LocalDate.now();
    }

    //Method do display the notification in the app
    public void display() {

    }

    //Method to mark the notification as read
    public void markAsRead() {

    }
}
