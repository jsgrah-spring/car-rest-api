package com.example.carrestapi.service;

import com.example.carrestapi.dto.CarResponse;
import com.example.carrestapi.entity.Car;
import com.example.carrestapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<CarResponse> getCars() {
        return repository.findAll().stream().map(CarResponse::new).collect(Collectors.toList());
    }

    public CarResponse getCarById(Integer id) {
        Optional<Car> car = repository.findById(id);
        if(car.isEmpty()) {
            return null;
        }
        return new CarResponse(car.get());
    }

    @Transactional
    public CarResponse saveCar(Car car) {
       Car persisted = repository.save(car);
        return new CarResponse(persisted);
    }

    @Transactional
    public void deleteCar(Integer id) {
        repository.deleteById(id);
    }
}
