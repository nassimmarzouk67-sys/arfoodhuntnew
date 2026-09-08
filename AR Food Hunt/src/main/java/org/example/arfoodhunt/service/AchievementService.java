package org.example.arfoodhunt.service;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Achievement;
import org.example.arfoodhunt.repository.AchievementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AchievementService {

    private final AchievementRepository repository;

    public List<Achievement> findAll() {
        return repository.findAll();
    }

    public Optional<Achievement> findById(String id) {
        return repository.findById(id);
    }

    public Achievement save(Achievement achievement) {
        return repository.save(achievement);
    }

    public Achievement update(String id, Achievement achievement) {
        achievement.setId(id);
        return repository.save(achievement);
    }



   public void delete(String id) {
      repository.deleteById(id);
   }
}