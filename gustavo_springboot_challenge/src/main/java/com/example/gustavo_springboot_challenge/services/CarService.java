package com.example.gustavo_springboot_challenge.services;

import com.example.gustavo_springboot_challenge.models.CarModel;
import com.example.gustavo_springboot_challenge.repositories.CarRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    final CarRepository carRepository;
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Transactional
    public CarModel save(CarModel carModel) {
        return carRepository.save(carModel);
    }
}
