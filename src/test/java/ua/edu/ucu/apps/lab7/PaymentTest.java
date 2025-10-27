package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.Payment;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    
    @Test
    public void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(150.0));
    }
    
    @Test
    public void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        assertTrue(payment.pay(200.0));
    }
}