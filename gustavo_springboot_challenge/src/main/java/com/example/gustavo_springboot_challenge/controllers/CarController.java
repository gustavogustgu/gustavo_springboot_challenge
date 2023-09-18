package com.example.gustavo_springboot_challenge.controllers;

import com.example.gustavo_springboot_challenge.dtos.CarResquestDto;
import com.example.gustavo_springboot_challenge.dtos.CarResponseDto;
import com.example.gustavo_springboot_challenge.mapper.CarMapper;
import com.example.gustavo_springboot_challenge.models.CarModel;
import com.example.gustavo_springboot_challenge.services.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<CarResponseDto> save(@Valid @RequestBody CarResquestDto createCarDto){
        CarModel carModel = CarMapper.toCarRequest(createCarDto);
        CarModel saveCar = carService.saveCar(carModel);
        CarResponseDto carDto = CarMapper.toCarResponse(carModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(carDto);
    }

    @GetMapping
    public ResponseEntity<List<CarResponseDto>> findAll(){
        List<CarModel> carModels = carService.findAll();
        List<CarResponseDto> carResponseDtos = CarMapper.toCarList(carModels);
        return ResponseEntity.status(HttpStatus.OK).body(carResponseDtos);
    }

   /*@GetMapping(value = "/{chassiId}")
    public ResponseEntity<CarResponseDto> findById(@PathVariable(name = "chassiId") Long chassiId){
        Optional<CarModel> optCar = carService.findById(chassiId);
       return optCar.map(carModel -> ResponseEntity.status(HttpStatus.OK).body(CarMapper
               .toCarResponse(carModel))).orElseGet(() -> ResponseEntity.notFound().build());
   }*/
}