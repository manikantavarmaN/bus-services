package com.bus.busservices.controller;

import com.bus.busservices.response.TrafikLabResponse;
import com.bus.busservices.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 100000L)
@RequestMapping("/api/v1")
public class BusController {

    @Autowired
    private BusService busService;
    @GetMapping("/bus/{modelType}")
    public ResponseEntity<TrafikLabResponse> busService(@PathVariable String modelType){
        return new ResponseEntity<TrafikLabResponse>(busService.getBusService(modelType), HttpStatus.OK);
    }

    @GetMapping("/bus/services")
    public ResponseEntity<String> busServiceDetails(){
        return new ResponseEntity<String>(busService.getBusService(), HttpStatus.OK);
    }
}
