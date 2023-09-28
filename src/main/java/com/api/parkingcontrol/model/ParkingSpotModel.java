package com.api.parkingcontrol.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licenseCarPlate;
    @Column
    private String carBrand;
    @Column
    private String carModel;
    @Column
    private String carColor;
    @Column
    private LocalDateTime registrationDate;
    @Column
    private String responsibleName;
    @Column
    private String apartment;
    @Column
    private String block;

}
