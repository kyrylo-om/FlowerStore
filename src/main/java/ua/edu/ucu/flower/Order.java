package ua.edu.ucu.flower;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.delivery.Delivery;
import ua.edu.ucu.payment.Payment;

public class Order {
    private List<Flower> items = new ArrayList<Flower>();
    private Payment payment;
    private Delivery delivery;

    public void addItem(Flower item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Flower item : items) {
            total += item.getFlowerBucket().getPrice();
        }
        total += payment.pay(total);
        total += delivery.deliver(total);
        return total;
    }
}
