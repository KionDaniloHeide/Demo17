package com.kion.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
