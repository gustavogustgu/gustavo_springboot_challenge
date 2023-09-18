package com.example.gustavo_springboot_challenge.services;

import com.example.gustavo_springboot_challenge.mapper.CarMapper;
import com.example.gustavo_springboot_challenge.models.CarModel;
import com.example.gustavo_springboot_challenge.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarModel> findAll(){
        return carRepository.findAll();
    }

    /*public Optional<CarModel> findById(Long chassiId){
        return carRepository.findById(chassiId);
    }*/

    public CarModel saveCar(CarModel carModel){
        return carRepository.save(carModel);
    }
}