package com.example.gustavo_springboot_challenge.dtos;

import com.example.gustavo_springboot_challenge.models.Brand;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarResponseDto {

    private Long chassiId;

    private String model;

    private Brand brand;

    private String color;

    private String fabricationYear;

}
