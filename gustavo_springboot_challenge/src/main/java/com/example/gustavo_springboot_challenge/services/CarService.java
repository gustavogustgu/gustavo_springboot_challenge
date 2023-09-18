package com.example.gustavo_springboot_challenge.services;


import com.example.gustavo_springboot_challenge.dtos.CarResponseDto;
import com.example.gustavo_springboot_challenge.dtos.CarResquestDto;
import com.example.gustavo_springboot_challenge.mapper.CarMapper;
import com.example.gustavo_springboot_challenge.models.CarModel;
import com.example.gustavo_springboot_challenge.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarResponseDto> findAll(){
        List<CarModel> carModels = carRepository.findAll();
        List<CarResponseDto> carResponseDtos = CarMapper.toCarList(carModels);
        return carResponseDtos;
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