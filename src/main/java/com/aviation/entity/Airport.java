package com.aviation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "AIRPORT")
public class Airport {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AIRPORT_ID")
    private String airportId;



   /*
    IATA code of City of Airport
    ICAO code of Airport
    Translations of name of Airport
    Latitude coordinates of Airport
    Longitude coordinates of Airport
    Geoname ID related to Airport
    Timezone of Airport location
    Timezone value in GMT of Airport
    Phone number of Airport
    Name of Country of Airport */

    @NotEmpty(message = "Please provide a name of airport")
    @ApiModelProperty(value = "Name of Airport")
    @Column(name = "NAME_AIRPORT")
    private String nameAirport;
    @NotEmpty(message = "Please provide IATA Code")
    @ApiModelProperty(value = "IATA code of Airport")
    @Column(name="CODE_IATA_AIRPORT")
    private String  codeIataAirport;
    @NotEmpty(message = "Please provide Iso Country")
    @ApiModelProperty("2 Digit ISO code of Country")
    @Column(name="CODE_ISO_COUNTRY")
    private String codeIso2Country;
    @NotEmpty(message = "Please provide IATA City")
    @Column(name="CODE_IATA_CITY")
    private String codeIataCity;
    @NotEmpty(message = "Please provide ICAO Airport City")
    @Column(name = "CODE_ICAO_AIRPORT")
    private String codeIcaoAirport;
    @Column(name= "NAME_TRANSLATIONS")
    @NotEmpty(message = "Please provide name translations")
    private String nameTranslations;
    @Column(name="LATITUDE_AIRPORT")
    @NotEmpty(message = "Please provide latitude of airport")
    private String latitudeAirport;
    @Column(name="LONGITUDE_AIRPORT")
    @NotEmpty(message = "Please provide longitude of airport")
    private String longitudeAirport;
    @Column(name="GEONAME_ID")
    @NotEmpty(message = "Please provide geoname ID")
    private String geonameId;
    @Column(name="TIME_ZONE")
    @NotEmpty(message = "Please provide timezone")
    private String timezone;
    @Column(name="GMT")
    @NotEmpty(message = "Please provide GMT")
    private String GMT;
    @Column(name="PHONE")
    @Pattern(regexp="(^\\+[0-9]{2}|^\\+[0-9]{2}\\(0\\)|^\\(\\+[0-9]{2}\\)\\(0\\)|^00[0-9]{2}|^0)([0-9]{9}$|[0-9\\-\\s]{10}$)",message = "Phone is not valid. Ex: +31235256677")
    @NotEmpty(message = "Please provide phone")
    private String phone;
    @Column(name="NAME_COUNTRY")
    @NotEmpty(message = "Please provide a name")
    private String nameCountry;
}
