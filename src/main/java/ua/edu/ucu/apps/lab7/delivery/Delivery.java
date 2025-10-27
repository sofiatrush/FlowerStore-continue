package ua.edu.ucu.apps.lab7.delivery;

public interface Delivery {
    void deliver(String address);
    double getDeliveryPrice(double orderPrice);
}