package ua.edu.ucu.apps.lab7.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paying by credit card " + amount);
        return true;
    }
}
