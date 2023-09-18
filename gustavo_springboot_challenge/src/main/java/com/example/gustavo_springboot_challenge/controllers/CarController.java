package com.example.gustavo_springboot_challenge.controllers;

import com.example.gustavo_springboot_challenge.dtos.CarResquestDto;
import com.example.gustavo_springboot_challenge.dtos.CarResponseDto;
import com.example.gustavo_springboot_challenge.services.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
        return ResponseEntity.status(HttpStatus.OK).body(carService.findAll());
    }

   @GetMapping(value = "/{chassiId}")
   public ResponseEntity<CarResponseDto> findById(@PathVariable(name = "chassiId") Long chassiId){
            return ResponseEntity.status(HttpStatus.OK).body(carService.findById(chassiId));

   }
}