package ua.edu.ucu.apps.lab7.flower;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;
    
    public FlowerPack(Flower flower, int quantity) {
    this.flower = flower;
    this.quantity = quantity;
}
    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    public boolean containsFlowerType(FlowerType type) {
        return this.flower.getFlowerType() == type;
    }
    
    public boolean containsFlowerColor(FlowerColor color) {
        return this.flower.getColor().equals(color.toString());
    }
}