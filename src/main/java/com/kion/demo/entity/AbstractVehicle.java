package com.kion.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public sealed abstract class AbstractVehicle permits Car, ForkliftTruck, Motorbike {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    public abstract int getWheelCount();

}
