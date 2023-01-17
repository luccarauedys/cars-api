package com.cars.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dtos.CarDTO;
import com.cars.api.models.Car;
import com.cars.api.repositories.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarController {

  @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> get() {
    return repository.findAll();
  }

  @PostMapping
  public CarDTO create(@RequestBody CarDTO data) {
    repository.save(new Car(data));
    return data;
  }
}
