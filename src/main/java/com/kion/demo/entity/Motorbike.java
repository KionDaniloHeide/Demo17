package com.kion.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "MotorBike")
@Data
public class Motorbike extends AbstractVehicle {

    @Override
    public int getWheelCount() {
        return 2;
    }
}
