package ua.edu.ucu.delivery;

public class PostStrategy implements Delivery {
    @Override
    public double deliver(double price) {
        if (price > 100) {
            return 0;
        }
        return 100;
    }
}
