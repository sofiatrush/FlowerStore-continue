package ua.edu.ucu.apps.lab7.flower;

import lombok.Getter;
import lombok.Setter;


 
@Setter
@Getter
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower() {
    }

    public Flower(FlowerColor color, double price, double sepalLength, FlowerType flowerType) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
        this.flowerType = flowerType;
    }

    public String getColor() {
        return color.toString();
    }
    public double getPrice() {
        return this.price;
    }
}
