package com.api.parkingcontrol.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
@Data

public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licenseCarPlate;
    @Column(nullable = false)
    private String carBrand;
    @Column(nullable = false)
    private String carModel;
    @Column(nullable = false)
    private String carColor;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false)
    private String responsibleName;
    @Column(nullable = false)
    private String apartment;
    @Column(nullable = false)
    private String block;

}
