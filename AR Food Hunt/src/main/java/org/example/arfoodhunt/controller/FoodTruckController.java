package org.example.arfoodhunt.controller;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.FoodTruck;
import org.example.arfoodhunt.service.FoodTruckService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/foodtrucks")
@RequiredArgsConstructor
public class FoodTruckController {

    private final FoodTruckService service;


    @GetMapping
    public List<FoodTruck> getAll() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Optional<FoodTruck> getById(@PathVariable String id) {
        return service.findById(id);
    }


    @PostMapping
    public FoodTruck create(@RequestBody FoodTruck foodTruck) {
        return service.save(foodTruck);
    }


    @PutMapping("/{id}")
    public FoodTruck update(
            @PathVariable String id,
            @RequestBody FoodTruck foodTruck) {

        return service.update(id, foodTruck);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}