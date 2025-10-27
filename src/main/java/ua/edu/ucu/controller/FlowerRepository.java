package ua.edu.ucu.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.edu.ucu.flower.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
    
}
