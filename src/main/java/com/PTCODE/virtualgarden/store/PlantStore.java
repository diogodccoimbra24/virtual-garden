package com.PTCODE.virtualgarden.store;

import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Plant;

import java.util.ArrayList;
import java.util.List;

public class PlantStore {

    //Attributes
    private List<Plant> availablePlants;

    //Constructor
    public PlantStore() {
        this.availablePlants = new ArrayList<Plant>();
    }

    //Method to display the plants in the store
    public void displayPlants() {

    }

    //Method to get the info of the plant selected (getter)
    public Plant getPlantInfo(String name) {
        //search for the plant by name
    }

    //Method to add a new plant to the garden
    public void addPlantToGarden(Garden garden, Plant plant) {

    }
}
