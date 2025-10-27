package ua.edu.ucu.apps.lab7.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal");
        return true;
    }
}
