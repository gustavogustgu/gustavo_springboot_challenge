package com.example.gustavo_springboot_challenge.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="car")

public class CarModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long chassiId;

    @Column(nullable = false, length = 70)
    private String model;

    @Column(nullable = false, length = 70)
    private String brand;

    @Column(nullable = false, length = 70)
    private String color;

    @Column(nullable = false, length = 8)
    private String fabricationYear;

    public CarModel() {
    }

    public Long getChassiId() {
        return chassiId;
    }

    public void setChassiId(Long chassiId) {
        this.chassiId = chassiId;
    }

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
