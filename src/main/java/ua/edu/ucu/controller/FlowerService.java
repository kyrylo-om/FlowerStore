package ua.edu.ucu.controller;
import java.util.List;

import org.springframework.stereotype.Service;

import ua.edu.ucu.flower.Flower;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
