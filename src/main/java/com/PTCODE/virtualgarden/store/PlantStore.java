package com.PTCODE.virtualgarden.store;

import com.PTCODE.virtualgarden.model.Garden;
import com.PTCODE.virtualgarden.model.Plant;
import com.PTCODE.virtualgarden.model.PlantType;
import java.util.Arrays;
import java.util.List;

public class PlantStore {

    //Method to display the plants in the store DC
    public List<PlantType> displayPlants() {
        return Arrays.asList(PlantType.values());
    }

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
