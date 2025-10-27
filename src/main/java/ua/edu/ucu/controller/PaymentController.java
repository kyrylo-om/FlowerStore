package ua.edu.ucu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.payment.CreditCardStrategy;
import ua.edu.ucu.payment.PayPalStrategy;

@RestController
@RequestMapping("/flower")
public class PaymentController {
    @GetMapping("/payment")
    public List<Double> getPayments() {
        double price1 = new CreditCardStrategy().pay(100);
        double price2 = new PayPalStrategy().pay(100);

        return List.of(price1, price2);
    }
}
