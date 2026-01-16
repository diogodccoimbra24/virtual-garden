package com.PTCODE.virtualgarden.model;

public enum PlantType {

    //Plants available in the plant store DC
    //Flowers DC
    ROSE("Rose", "Flower", 14, 10),
    SUNFLOWER("Sunflower", "Flower", 16, 23),
    TULIP("Tulip", "Flower", 12, 18),

    //Vegetables DC
    CARROT("Carrot", "Vegetable", 20, 13),
    POTATO("Potato", "Vegetable", 14, 29),
    TOMATO("Tomato", "Vegetable", 15, 20);

    //Attributes as final so it's impossible to modify DC
    private final String name;
    private final String category;

    private final double thirstyTemp;
    private final double dyingTemp;

    //Constructor
    PlantType(String name, String category, double thirstyTemp, double dyingTemp ){
        this.name = name;
        this.category = category;
        this.thirstyTemp = thirstyTemp;
        this.dyingTemp = dyingTemp;
    }

    //Get the name of the flower or vegetable (getter) DC
    public String getName(){
        return this.name;
    }

    //Get the type (getter) DC
    public String getCategory(){
        return this.category;
    }

    //Get the thirsty temperature DC
    public double getThirstyTemp(){
        return thirstyTemp;
    }

    //Get the dying temperature DC
    public double getDyingTemp() {
        return dyingTemp;
    }
}
