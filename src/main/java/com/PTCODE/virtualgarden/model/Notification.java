package com.PTCODE.virtualgarden.model;

import java.time.LocalDate;

public class Notification {

    //Attributes DC
    private String message;
    private String type;
    private LocalDate date;
    private boolean isRead;

    //Constructor DC
    public Notification(String message, String type) {
        this.message = message;
        this.type = type;
        //It will show the current date DC
        this.date = LocalDate.now();
        //Default state of the notification is false DC
        this.isRead = false;
    }

    //Method do display the notification in the app DC
    //public String display() {
        //Used to display the notification in the ui (still figuring out)
    //}

    //Method to mark the notification as read DC
    public void markAsRead() {
        isRead = true;
    }

    //Method to get the message (getter) DC
    public String getMessage(){
        return this.message;
    }

    //Method to get the type (getter) DC
    public String getType(){
        return this.type;
    }

    //Method to get the date (getter) DC
    public LocalDate getDate(){
        return this.date;
    }

    public boolean isRead(){
        return this.isRead;
    }
}
