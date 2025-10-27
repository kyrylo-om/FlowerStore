package ua.edu.ucu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.flower.Flower;
import ua.edu.ucu.payment.CreditCardStrategy;
import ua.edu.ucu.payment.PayPalStrategy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/flower")
public class FlowerController {
    private final FlowerService flowerService;

    private FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    @GetMapping("/")
    public List<Flower> hello() {
        return flowerService.getFlowers();
    }
    

    @PostMapping("/")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
    
}
