package com.example.gustavo_springboot_challenge.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(nullable = false)
    private String fabricationYear;
}
