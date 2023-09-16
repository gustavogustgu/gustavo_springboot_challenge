package com.example.gustavo_springboot_challenge.dtos;
import com.example.gustavo_springboot_challenge.models.Brand;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {

    private String chassiId;

    private String name;

    private Brand brand;

    private String color;

    private String fabricationYear;
}
