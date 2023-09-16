package com.example.gustavo_springboot_challenge.repositories;

import com.example.gustavo_springboot_challenge.models.CarModel;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository  extends JpaRepository<CarModel, Id> {

}
