package com.example.gustavo_springboot_challenge.models;

public enum Brand {
    FORD ("FORD"),
    CHEVROLET("CHEVROLET"),
    BMW("BMW"),
    VOLVO("VOLVO");

    private final String brandName;
    Brand(String brand) {
        brandName = brand;
    }
}
