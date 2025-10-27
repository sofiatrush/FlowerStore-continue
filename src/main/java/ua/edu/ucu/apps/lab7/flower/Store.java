package ua.edu.ucu.apps.lab7.flower;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> inventory = new ArrayList<>();
    
    public void addBucket(FlowerBucket bucket) {
        inventory.add(bucket);
    }
    
    public List<FlowerBucket> search(
        FlowerType type, FlowerColor color, double maxPrice
        ) {
        List<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket bucket : inventory) {
            boolean matches = true;
            if (type != null && !bucket.hasFlowerType(type)) {
                matches = false;
            }
            if (color != null && !bucket.hasFlowerColor(color)) {
                matches = false;
            }
            if (maxPrice > 0 && bucket.getPrice() > maxPrice) {
                matches = false;
            }
            
            if (matches) {
                result.add(bucket);
            }
        }
        return result;
    }
}