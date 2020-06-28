package com.aviation.controller;

import com.aviation.entity.Airplane;
import com.aviation.entity.Airport;
import com.aviation.entity.ApiError;
import com.aviation.repository.AirplaneRepository;
import com.aviation.repository.AirportRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@Api(value = "AirplaneController" , tags = {"Airplane Controller"})
@SwaggerDefinition(tags = {
        @Tag(name = "Airplane Controller", description = "Add/Get Airplane")
})
@RestController
@RequestMapping("/v1/")
@Validated
public class AirplaneController {

    @Autowired
    private AirplaneRepository airplaneRepository;


    @ApiOperation(httpMethod = "POST", value = "Add Airport",
            notes = "Please note that required fields.",
            produces = "application/json")
    @ApiResponses(value =
            {
                    @ApiResponse(code = 200, message = "Successful", response = String.class),
                    @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
            }
    )
    @PostMapping(path = "/airplane/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<HashMap> addAirplane(@Valid @RequestBody Airplane airplane) {
        Airplane airplaneResult = airplaneRepository.save(airplane);

        HashMap<String, Object> map = new HashMap<>();
        map.put("id", airplaneResult.getAirplaneId());

        return ResponseEntity.ok(map);
    }

    @ApiOperation(httpMethod = "GET", value = "Finds Airplane By Owner Name",
            produces = "application/json")
    @ApiResponses(value =
            {
                    @ApiResponse(code = 200, message = "Successful", response = List.class),
                    @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
            }
    )
    @GetMapping(path = "/airplane/", produces = "application/json")
    public ResponseEntity<List<Airplane>> searchAirplane(String owner) {
        if(StringUtils.isEmpty(owner)){
            return ResponseEntity.ok(airplaneRepository.findAll());
        }else{
            return ResponseEntity.ok(airplaneRepository.findAirplaneByOwner(owner));
        }
    }
}
