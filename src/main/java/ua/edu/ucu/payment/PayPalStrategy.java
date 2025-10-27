package ua.edu.ucu.payment;

public class PayPalStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
