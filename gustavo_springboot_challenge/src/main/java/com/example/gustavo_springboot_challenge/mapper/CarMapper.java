package com.example.gustavo_springboot_challenge.mapper;
import com.example.gustavo_springboot_challenge.dtos.CarResquestDto;
import com.example.gustavo_springboot_challenge.dtos.CarResponseDto;
import com.example.gustavo_springboot_challenge.models.CarModel;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarMapper {

    public static CarModel toCarRequest(CarResquestDto createCarDto){
        CarModel carModel = new CarModel();
        carModel.setModel(createCarDto.getModel());
        carModel.setBrand(createCarDto.getBrand());
        carModel.setColor(createCarDto.getColor());
        carModel.setFabricationYear(createCarDto.getFabricationYear());
        return carModel;
    }

    public static CarResponseDto toCarResponse(CarModel carModel){
        CarResponseDto carDto = new CarResponseDto();
        carDto.setChassiId(carModel.getChassiId());
        carDto.setModel(carModel.getModel());
        carDto.setBrand(carModel.getBrand());
        carDto.setColor(carModel.getColor());
        carDto.setFabricationYear(carModel.getFabricationYear());
        return carDto;
    }

    public static List<CarResponseDto> toCarList(List<CarModel> car){
        List<CarResponseDto> carDtos = new ArrayList<>();
        for (CarModel carModel : car){
            carDtos.add(toCarResponse(carModel));
        }
        return carDtos;
    }
}