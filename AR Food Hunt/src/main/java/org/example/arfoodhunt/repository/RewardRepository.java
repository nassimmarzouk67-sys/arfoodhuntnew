package org.example.arfoodhunt.repository;

import org.example.arfoodhunt.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository  extends JpaRepository<Reward, String> {
}
