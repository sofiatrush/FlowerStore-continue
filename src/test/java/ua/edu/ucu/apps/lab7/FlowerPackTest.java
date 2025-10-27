package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.flower.Flower;
import ua.edu.ucu.apps.lab7.flower.FlowerColor;
import ua.edu.ucu.apps.lab7.flower.FlowerPack;
import ua.edu.ucu.apps.lab7.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerPackTest {
    
    @Test
    public void testFlowerPackPrice() {
        Flower flower = new Flower(FlowerColor.RED, 25.0, 8.0, FlowerType.CHAMOMILE);
        FlowerPack pack = new FlowerPack(flower, 4);
        assertEquals(100.0, pack.getPrice());
    }
    
    @Test
    public void testFlowerPackContainsType() {
        Flower flower = new Flower(FlowerColor.BLUE, 40.0, 12.0, FlowerType.TULIP);
        FlowerPack pack = new FlowerPack(flower, 2);
        assertTrue(pack.containsFlowerType(FlowerType.TULIP));
        assertFalse(pack.containsFlowerType(FlowerType.ROSE));
    }
}
