package ua.edu.ucu.apps.lab7.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;
    

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack pack) {
        flowerPacks.add(pack);
    }
    
    public double getPrice() {
        double total = 0;
        for (FlowerPack pack : flowerPacks) {
            total += pack.getPrice();
        }
        return total;
    }

    public boolean hasFlowerType(FlowerType type) {
        for (FlowerPack pack : flowerPacks) {
            if (pack.containsFlowerType(type)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean hasFlowerColor(FlowerColor color) {
        for (FlowerPack pack : flowerPacks) {
            if (pack.containsFlowerColor(color)) {
                return true;
            }
        }
        return false;
    }
}