package com.PTCODE.virtualgarden.model;

public enum PlantType {

    //Plants available in the plant store DC
    //Flowers DC
    ROSE("Rose", "Flower"),
    SUNFLOWER("Sunflower", "Flower"),
    TULIP("Tulip", "Flower"),

    //Vegetables DC
    CARROT("Carrot", "Vegetable"),
    POTATO("Potato", "Vegetable"),
    TOMATO("Tomato", "Vegetables");

    //Attributes as final so it's impossible to modify DC
    private final String name;
    private final String category;

    //Constructor
    PlantType(String name, String category){
        this.name = name;
        this.category = category;
    }

    //Get the name of the flower or vegetable (getter) DC
    public String getName(){
        return this.name;
    }

    //Get the type (getter) DC
    public String getCategory(){
        return this.category;
    }
}
