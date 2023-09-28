package com.api.parkingcontrol.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    @Size(max = 7)
    private String licenseCarPlate;

    @NotBlank
    private String carBrand;


    private String carModel;


    private String carColor;


    private String responsibleName;


    private String apartment;


    private String block;


}
