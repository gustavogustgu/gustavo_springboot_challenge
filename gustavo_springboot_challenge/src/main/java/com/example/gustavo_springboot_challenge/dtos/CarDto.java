package com.example.gustavo_springboot_challenge.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class CarDto {


    @NotBlank
    private String model;
    @NotBlank
    private String brand;
    @NotBlank
    private String color;
    @NotBlank
    private String fabricationYear;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear) {
        this.fabricationYear = fabricationYear;
    }
}
