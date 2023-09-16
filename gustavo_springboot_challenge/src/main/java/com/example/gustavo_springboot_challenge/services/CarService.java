package com.example.gustavo_springboot_challenge.services;

import com.example.gustavo_springboot_challenge.dtos.CarDto;
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


    public CarDto save(CreationCarDto creationCarDto) {
        var carModel = new CarModel();
        carModel.setModel(creationCarDto.getName());
        carModel.setBrand(creationCarDto.getBrand());
        carModel.setColor(creationCarDto.getColor());
        carModel.setFabricationYear(creationCarDto.getFabricationYear());
        carModel = carRepository.save(carModel);
        var carDto = new CarDto();
        carDto.setName(carModel.getModel());
        carDto.setBrand(carModel.getBrand());
        carDto.setColor(carModel.getColor());
        carDto.setFabricationYear(carModel.getFabricationYear());
        return carDto;
    }
}
