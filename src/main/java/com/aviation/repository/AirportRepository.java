package com.aviation.repository;

import com.aviation.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

    @Override
    public <S extends Airport> S save(S s);

    @Override
    List<Airport> findAll();

    @Query(
            value = "SELECT * FROM AIRPORT a WHERE NAME_AIRPORT = ?1",
            nativeQuery = true)
    List<Airport> findAirportByName(String name);
}
