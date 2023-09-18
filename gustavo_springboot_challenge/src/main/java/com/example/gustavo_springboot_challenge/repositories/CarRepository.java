package com.example.gustavo_springboot_challenge.repositories;

import com.example.gustavo_springboot_challenge.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CarRepository extends JpaRepository<CarModel, Long> {
    Optional<CarModel> findById(Long chassiId);
}
