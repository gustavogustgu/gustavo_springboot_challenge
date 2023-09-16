package com.example.gustavo_springboot_challenge.models;

public enum Brand {
    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    BMW("BMW"),
    VOLVO("Volvo");

    private final String brandName;
    Brand(String brand) {
        brandName = brand;
    }
}
