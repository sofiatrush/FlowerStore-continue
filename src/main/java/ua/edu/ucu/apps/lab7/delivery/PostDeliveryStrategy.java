package ua.edu.ucu.apps.lab7.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(String address) {
        System.out.println("Delivering by post to: " + address);
    }

    @Override
    public double getDeliveryPrice(double orderPrice) {
        return orderPrice > 1000 ? 0 : 50;
    }
}
