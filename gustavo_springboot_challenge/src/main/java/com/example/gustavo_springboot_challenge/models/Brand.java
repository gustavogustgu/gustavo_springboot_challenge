package com.example.gustavo_springboot_challenge.models;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Brand {
    Ford("Ford"),
    Chevrolet("Chevrolet"),
    BMW("BMW"),
    Volvo("Volvo");

    private final String brandName;

}
