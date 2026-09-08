package org.example.arfoodhunt.repository;

import org.example.arfoodhunt.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement, String> {
}
