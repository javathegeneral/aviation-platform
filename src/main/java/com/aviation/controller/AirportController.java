package com.aviation.controller;

import com.aviation.entity.Airport;
import com.aviation.entity.ApiError;
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

@Api(value = "AirportController" , tags = {"Airport Controller"})
@SwaggerDefinition(tags = {
        @Tag(name = "Airport Controller", description = "Add/Get Airport")
})
@RestController
@RequestMapping("/v1/")
@Validated
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;


    @ApiOperation(httpMethod = "POST", value = "Add Airport",
            notes = "Please note that required fields.",
            produces = "application/json")
    @ApiResponses(value =
            {
                    @ApiResponse(code = 200, message = "Successful", response = String.class),
                    @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
            }
    )
    @PostMapping(path = "/airport", consumes = "application/json", produces = "application/json")
    public ResponseEntity<HashMap> addAiport(@Valid @RequestBody  Airport airport) {
        Airport airportResult = airportRepository.save(airport);

        HashMap<String, Object> map = new HashMap<>();
        map.put("id", airportResult.getAirportId());

        return ResponseEntity.ok(map);
    }

    @GetMapping(path = "/airport/", produces = "application/json")
    public ResponseEntity<List<Airport>> searchAirport(String name) {
        if(StringUtils.isEmpty(name)){
            return ResponseEntity.ok(airportRepository.findAll());
        }else{
            return ResponseEntity.ok(airportRepository.findAirportByName(name));
        }
    }
}
