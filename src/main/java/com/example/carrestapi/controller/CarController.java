package com.example.carrestapi.controller;

import com.example.carrestapi.dto.CarResponse;
import com.example.carrestapi.entity.Car;
import com.example.carrestapi.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarResponse>> getCars() {
        return ResponseEntity.ok(service.getCars());
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CarResponse> getCarById(@PathVariable int id) {

        CarResponse car = service.getCarById(id);

        if (car == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(car);
    }

    @RequestMapping(value = "/cars", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CarResponse> addCar(@RequestBody Car car) {
        return ResponseEntity.ok(service.saveCar(car));
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteCar(@PathVariable int id) {
        CarResponse car = service.getCarById(id);

        if (car == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        service.deleteCar(id);
        return ResponseEntity.ok("Deleted car id - " + id);
    }
}
