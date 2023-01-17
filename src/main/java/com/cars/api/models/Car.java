package com.cars.api.models;

import com.cars.api.dtos.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {
  public Car(CarDTO data) {
    this.model = data.model();
    this.manufacturer = data.manufacturer();
    this.dateOfManufacture = data.dateOfManufacture();
    this.price = data.price();
    this.modelYear = data.modelYear();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50, nullable = false)
  private String model;

  @Column(length = 50, nullable = false)
  private String manufacturer;

  @Column(length = 10, nullable = false)
  private String dateOfManufacture;

  @Column(nullable = false)
  private double price;

  @Column(nullable = false)
  private int modelYear;
}
