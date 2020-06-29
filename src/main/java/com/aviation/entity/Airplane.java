package com.aviation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="AIRPLANE")
public class Airplane {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AIRPLANE_ID")
    private String airplaneId;
    @Column(name="NUMBER_REGISTRATION")
    private String numberRegistration;
    @Column(name="PRODUCTION_LINE")
    private String productionLine;
    @Column(name="AIRPLANE_IATA_TYPE")
    private String airplaneIataType;
    @Column(name="PLANE_MODEL")
    private String planeModel;
    @Column(name="MODEL_CODE")
    private String modelCode;
    @Column(name="ICAO_AIRPLANE")
    private String hexIcaoAirplane;
    @Column(name="CODE_IATA_PLANE_SHORT")
    private String CodeIataPlaneShort;
    @Column(name="CODE_IATA_PLANE_LONG")
    private String codeIataPlaneLong;
    @Column(name="CONSTRUCTION_NUMBER")
    private String constructionNumber;
    @Column(name="NUMBER_TEST_REGISTRATION")
    private String numberTestRegistration;
    @Column(name="ROLLOUT_DATE")
    private String rolloutDate;
    @Column(name="FIRST_FLIGHT")
    private String firstFlight;
    @Column(name="DELIVERY_DATE")
    private String deliveryDate;
    @Column(name="REGISTRATION_DATE")
    private String registrationDate;
    @Column(name="LINE_NUMBER")
    private String lineNumber;
    @Column(name="PLANE_SERIES")
    private String planeSeries;
    @Column(name="CODE_IATA_AIRLINE")
    private String codeIataAirline;
    @Column(name="CODE_ICAO_AIRLINE")
    private String codeIcaoAirline;
    @Column(name="PLANE_OWNER")
    private String planeOwner;
    @Column(name="ENGINES_COUNT")
    private String enginesCount;
    @Column(name="ENGINES_TYPE")
    private String enginesType;
    @Column(name="PLANE_AGE")
    private String planeAge;
    @Column(name="PLANE_STATUS")
    private String planeStatus;
    @Column(name="TBA")
    private String tba;
}
