package org.example.arfoodhunt.service;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.FoodTruck;
import org.example.arfoodhunt.repository.FoodTruckRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodTruckService {

    private final FoodTruckRepository repository;

    public List<FoodTruck> findAll() {
        return repository.findAll();
    }

    public Optional<FoodTruck> findById(String id) {
        return repository.findById(id);
    }

    public FoodTruck save(FoodTruck foodTruck) {
        return repository.save(foodTruck);
    }

    public FoodTruck update(String id, FoodTruck foodTruck) {
        foodTruck.setId(id);
        return repository.save(foodTruck);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}