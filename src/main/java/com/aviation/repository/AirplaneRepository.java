package com.aviation.repository;

import com.aviation.entity.Airplane;
import com.aviation.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, Long> {

    @Override
    public <S extends Airplane> S save(S s);

    @Override
    List<Airplane> findAll();

    @Query(
            value = "SELECT * FROM AIRPLANE a WHERE NAME_AIRPORT = ?1",
            nativeQuery = true)
    List<Airplane> findAirplaneByOwner(String name);
}
