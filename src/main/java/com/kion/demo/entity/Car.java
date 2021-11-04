package com.kion.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "Car")
@Data
public non-sealed class Car extends AbstractVehicle {

    @Override
    public int getWheelCount() {
        return 4;
    }
}
