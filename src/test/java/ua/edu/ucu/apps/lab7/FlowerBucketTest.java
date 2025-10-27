package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.flower.Flower;
import ua.edu.ucu.apps.lab7.flower.FlowerBucket;
import ua.edu.ucu.apps.lab7.flower.FlowerColor;
import ua.edu.ucu.apps.lab7.flower.FlowerPack;
import ua.edu.ucu.apps.lab7.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerBucketTest {
    
    @Test
    public void testBucketPrice() {
        FlowerBucket bucket = new FlowerBucket();
        Flower rose = new Flower(FlowerColor.RED, 50.0, 10.0, FlowerType.ROSE);
        Flower tulip = new Flower(FlowerColor.BLUE, 30.0, 8.0, FlowerType.TULIP);
        
        bucket.add(new FlowerPack(rose, 2));
        bucket.add(new FlowerPack(tulip, 3));
        
        assertEquals(190.0, bucket.getPrice());
    }
    
    @Test
    public void testEmptyBucket() {
        FlowerBucket bucket = new FlowerBucket();
        assertEquals(0.0, bucket.getPrice());
    }
}