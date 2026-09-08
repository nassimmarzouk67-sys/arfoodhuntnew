package org.example.arfoodhunt.repository;

import org.example.arfoodhunt.entity.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTruckRepository extends JpaRepository<FoodTruck, String> {
}
