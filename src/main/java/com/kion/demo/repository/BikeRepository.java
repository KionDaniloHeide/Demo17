package com.kion.demo.repository;

import com.kion.demo.entity.Bike;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BikeRepository extends CrudRepository<Bike, Long> {


    @Query("""
                SELECT b
                FROM Bike b
                WHERE b.sTVOcompliant = true
                """)
    List<Bike> findAllValid();
}
