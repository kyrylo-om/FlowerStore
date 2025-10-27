package ua.edu.ucu.delivery;

public class DHLStrategy implements Delivery {
    @Override
    public double deliver(double price) {
        return 20;
    }
}
