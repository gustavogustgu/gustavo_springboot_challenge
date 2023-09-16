package com.example.gustavo_springboot_challenge.controllers;

import com.example.gustavo_springboot_challenge.dtos.CarDto;
import com.example.gustavo_springboot_challenge.models.CarModel;
import com.example.gustavo_springboot_challenge.services.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {
    final CarService carService;
    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCar(@RequestBody @Valid CarDto carDto){
        var carModel = new CarModel();
        BeanUtils.copyProperties(carDto, carModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(carModel));
    }
}