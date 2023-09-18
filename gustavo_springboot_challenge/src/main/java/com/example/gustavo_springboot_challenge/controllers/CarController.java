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
    public ResponseEntity<CarResponseDto> salvar(@Valid @RequestBody CarResquestDto carResquestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(carResquestDto));
    }

    @GetMapping
    public ResponseEntity<List<CarResponseDto>> findAll(){
        List<CarModel> carModels = carService.findAll();
        List<CarResponseDto> carResponseDtos = CarMapper.toCarList(carModels);
        return ResponseEntity.status(HttpStatus.OK).body(carResponseDtos);
    }

   @GetMapping(value = "/{chassiId}")
   public CarResponseDto findById(@PathVariable(name = "chassiId") Long chassiId){
        return carService.findById(chassiId);
   }
}