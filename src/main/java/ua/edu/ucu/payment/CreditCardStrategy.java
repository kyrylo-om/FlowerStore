package ua.edu.ucu.payment;

public class CreditCardStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
