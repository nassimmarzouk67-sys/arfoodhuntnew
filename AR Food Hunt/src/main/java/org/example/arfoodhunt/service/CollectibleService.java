package org.example.arfoodhunt.service;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Collectible;
import org.example.arfoodhunt.repository.CollectibleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CollectibleService {

    private final CollectibleRepository repository;

    public List<Collectible> findAll() {
        return repository.findAll();
    }

    public Optional<Collectible> findById(String id) {
        return repository.findById(id);
    }

    public Collectible save(Collectible collectible) {
        return repository.save(collectible);
    }

    public Collectible update(String id, Collectible collectible) {
        collectible.setId(id);
        return repository.save(collectible);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}