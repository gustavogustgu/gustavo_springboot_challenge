package com.example.gustavo_springboot_challenge.controllers;

import com.example.gustavo_springboot_challenge.dtos.CreationCarDto;
import com.example.gustavo_springboot_challenge.services.CarService;
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
    public ResponseEntity<Object> saveCar(@RequestBody CreationCarDto creationCarDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(creationCarDto));
    }
}