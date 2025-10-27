package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.flower.FlowerColor;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerColorTest {
    
    @Test
    public void testFlowerColorToString() {
        assertEquals("#FF0000", FlowerColor.RED.toString());
        assertEquals("#0000FF", FlowerColor.BLUE.toString());
    }
}