package com.kion.demo.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Bike")
@Data
public class Bike {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "stvocompliant", nullable = false)
    private boolean sTVOcompliant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
