package org.example.arfoodhunt.service;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Reward;
import org.example.arfoodhunt.repository.RewardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RewardService {

    private final RewardRepository repository;

    public List<Reward> findAll() {
        return repository.findAll();
    }

    public Optional<Reward> findById(String id) {
        return repository.findById(id);
    }

    public Reward save(Reward reward) {
        return repository.save(reward);
    }

    public Reward update(String id, Reward reward) {
        reward.setId(id);
        return repository.save(reward);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}