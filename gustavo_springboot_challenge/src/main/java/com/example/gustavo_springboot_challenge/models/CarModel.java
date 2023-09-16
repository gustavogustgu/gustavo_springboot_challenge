package com.example.gustavo_springboot_challenge.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="car")
@Getter
@Setter

public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassiId;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private Brand brand;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false, length = 9)
    private String fabricationYear;

}
