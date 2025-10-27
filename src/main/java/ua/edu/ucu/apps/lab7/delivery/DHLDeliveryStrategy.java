package ua.edu.ucu.apps.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(String address) {
        System.out.println("Delivering by DHL to: " + address);
    }

    @Override
    public double getDeliveryPrice(double orderPrice) {
        return 100; // fixed price for DHL
    }
}