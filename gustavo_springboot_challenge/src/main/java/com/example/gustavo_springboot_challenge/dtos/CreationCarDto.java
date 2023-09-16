package com.example.gustavo_springboot_challenge.dtos;
import com.example.gustavo_springboot_challenge.models.Brand;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreationCarDto {

    @NotBlank
    private String name;
    @NotBlank
    private Brand brand;
    @NotBlank
    private String color;
    @NotBlank
    private String fabricationYear;
}
