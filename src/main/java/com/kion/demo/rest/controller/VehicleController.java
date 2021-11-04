package com.kion.demo.rest.controller;

import com.kion.demo.entity.Bike;
import com.kion.demo.repository.BikeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(path = "/vehicles")
public class VehicleController {

    private BikeRepository bikeRepository;

    public VehicleController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping(path = "/wheelCount/{vehicleType}")
    public int getWheelCount(@PathVariable String vehicleType){
        return
            switch(vehicleType) {
                case "Car" -> 4;
                case "Motorbike", "Bike" -> 2;
                default -> 0;
            };
    }

    @GetMapping(path = "/bikes")
    public List<Bike> getallBikes(){
        return bikeRepository.findAllValid();
    }
}
