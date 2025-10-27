package ua.edu.ucu.apps.lab7.flower;

import ua.edu.ucu.apps.lab7.delivery.Delivery;
import ua.edu.ucu.apps.lab7.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public boolean processOrder() {
        double total = calculateTotalPrice();
        if (delivery != null) {
            total += delivery.getDeliveryPrice(total);
        }
        
        if (payment != null && payment.pay(total)) {
            if (delivery != null) {
                delivery.deliver("Customer Address");
            }
            return true;
        }
        return false;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}