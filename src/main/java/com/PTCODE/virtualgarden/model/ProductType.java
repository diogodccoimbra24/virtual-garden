package com.PTCODE.virtualgarden.model;

public enum ProductType {

    //Types of products DC
    WATER("Water"),
    FERTILIZER("Fertilizer");

    //Attribute DC
    private final String name;

    //Constructor DC
    ProductType(String name){
        this.name = name;
    }

    //get the name of the product (getter) DC
    public String getName(){
        return this.name;
    }

}
