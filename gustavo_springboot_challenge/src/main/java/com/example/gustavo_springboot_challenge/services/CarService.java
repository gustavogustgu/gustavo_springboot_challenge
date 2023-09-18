package com.example.gustavo_springboot_challenge.services;


import com.example.gustavo_springboot_challenge.dtos.CarResponseDto;
import com.example.gustavo_springboot_challenge.dtos.CarResquestDto;
import com.example.gustavo_springboot_challenge.mapper.CarMapper;
import com.example.gustavo_springboot_challenge.models.CarModel;
import com.example.gustavo_springboot_challenge.repositories.CarRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

    public CarResponseDto findById(Long chassiId){
        CarModel carModel = carRepository.findById(chassiId).get();
        return CarMapper.toCarResponse(carModel);
    }



    public CarResponseDto save(CarResquestDto carResquestDto) {
        CarModel carModel = CarMapper.toCarRequest(carResquestDto);
        var response = carRepository.save(carModel);
        return CarMapper.toCarResponse(response);
    }

}