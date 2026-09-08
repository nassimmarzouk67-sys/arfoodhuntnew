package org.example.arfoodhunt.repository;

import org.example.arfoodhunt.entity.Collectible;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectibleRepository extends JpaRepository<Collectible, String> {
}
