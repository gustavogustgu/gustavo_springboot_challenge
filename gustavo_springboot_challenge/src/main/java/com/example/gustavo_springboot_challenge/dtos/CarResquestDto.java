package com.example.gustavo_springboot_challenge.dtos;

import com.example.gustavo_springboot_challenge.models.Brand;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarResquestDto {

    @NotBlank
    private String model;
    @NotBlank
    private Brand brand;
    @NotBlank
    private String color;
    @NotBlank
    private String fabricationYear;
}
