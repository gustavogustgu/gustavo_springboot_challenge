package com.example.gustavo_springboot_challenge.controllers;

import com.example.gustavo_springboot_challenge.dtos.CreationCarDto;
import com.example.gustavo_springboot_challenge.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    private void validateData(String date) throws Exception{

        var years = date.split("/");

        var firstHas4digits = years[0].length() == 4;
        var secondHas4digits = years[1].length() == 4;

        if(!firstHas4digits && !secondHas4digits)
            throw new Exception("Invalid date");

        try{
            Integer.valueOf(years[0]);
            Integer.valueOf(years[1]);

        }catch(Exception e){
            throw new Exception("Invalid date");
        }
    }

    @PostMapping
    public ResponseEntity<Object> saveCar(@RequestBody CreationCarDto creationCarDto){
        try{
            validateData(creationCarDto.getFabricationYear());
            return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(creationCarDto));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}