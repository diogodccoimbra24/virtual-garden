package com.PTCODE.virtualgarden.store;

import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Plant;
import com.PTCODE.virtualgarden.model.PlantType;

public class PlantStore {


    //Method to add a new plant to the garden DC
    public boolean addPlantToGarden(Garden garden, PlantType type) {

        if (garden == null || type == null){
            return false;
        }
        Plant newPlant = new Plant(type);
        garden.addPlant(newPlant);
        return true;
    }
}
