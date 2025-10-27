package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerTypeTest {
    
    @Test
    public void testFlowerTypeValues() {
        assertNotNull(FlowerType.CHAMOMILE);
        assertNotNull(FlowerType.ROSE);
        assertNotNull(FlowerType.TULIP);
    }
}