package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab7.flower.Item;
import ua.edu.ucu.apps.lab7.flower.Order;
import ua.edu.ucu.apps.lab7.payment.CreditCardPaymentStrategy;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    
    class TestItem extends Item {
        private double price;
        
        public TestItem(double price) {
            this.price = price;
        }
        
        @Override
        public double getPrice() {
            return price;
        }
        
        @Override
        public String getDescription() {
            return "Test Item";
        }
    }
    
    @Test
    public void testOrderTotalPrice() {
        Order order = new Order();
        order.addItem(new TestItem(100.0));
        order.addItem(new TestItem(50.0));
        
        assertEquals(150.0, order.calculateTotalPrice());
    }
    
    @Test
    public void testOrderProcess() {
        Order order = new Order();
        order.addItem(new TestItem(500.0));
        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        
        assertTrue(order.processOrder());
    }
}
