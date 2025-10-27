package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.Delivery;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryTest {
    
    @Test
    public void testPostDelivery() {
        Delivery delivery = new PostDeliveryStrategy();
        assertEquals(100.0, delivery.delivery(500.0));
        assertEquals(0.0, delivery.delivery(1500.0));
    }
    
    @Test
    public void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        assertEquals(150.0, delivery.delivery(100.0));
    }
}