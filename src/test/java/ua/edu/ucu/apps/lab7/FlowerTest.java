package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.flower.Flower;
import ua.edu.ucu.apps.lab7.flower.FlowerColor;
import ua.edu.ucu.apps.lab7.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerTest {
    
    @Test
    public void testFlowerCreation() {
        Flower flower = new Flower(FlowerColor.RED, 50.0, 10.0, FlowerType.ROSE);
        assertEquals(50.0, flower.getPrice());
        assertEquals("#FF0000", flower.getColor());
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
    
    @Test
    public void testFlowerSetters() {
        Flower flower = new Flower();
        flower.setPrice(30.0);
        flower.setColor(FlowerColor.BLUE);
        flower.setFlowerType(FlowerType.TULIP);
        
        assertEquals(30.0, flower.getPrice());
        assertEquals("#0000FF", flower.getColor());
        assertEquals(FlowerType.TULIP, flower.getFlowerType());
    }
}
