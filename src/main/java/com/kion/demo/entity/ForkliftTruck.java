package com.kion.demo.entity;

import lombok.Data;

@Data
public final class ForkliftTruck extends AbstractVehicle {
    @Override public int getWheelCount() {
        return 4;
    }
}
