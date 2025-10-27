package ua.edu.ucu.apps.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double delivery(double orderPrice) {
        System.out.println("DHL Delivery");
        return 150;
    }
}