package com.kion.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "MotorBike")
@Data
public non-sealed class Motorbike extends AbstractVehicle {

    @Override
    public int getWheelCount() {
        return 2;
    }
}
