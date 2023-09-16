package com.example.gustavo_springboot_challenge.services;

import com.example.gustavo_springboot_challenge.dtos.CreationCarDto;

import com.example.gustavo_springboot_challenge.models.CarModel;
import com.example.gustavo_springboot_challenge.repositories.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    final CarRepository carRepository;
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }


    public CarModel save(CreationCarDto creationCarDto) {
        var carModel = new CarModel();
        carModel.setModel(creationCarDto.getModel());
        carModel.setColor(creationCarDto.getColor());
        carModel.setFabricationYear(creationCarDto.getFabricationYear());
        carModel.setBrand(creationCarDto.getBrand());
        return carRepository.save(carModel);
    }
}
