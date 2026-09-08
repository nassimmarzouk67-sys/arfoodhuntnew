package org.example.arfoodhunt.service;


import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Collection;
import org.example.arfoodhunt.repository.CollectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CollectionService {

    private final CollectionRepository repository;

    public List<Collection> findAll() {
        return repository.findAll();
    }

    public Optional<Collection> findById(String id) {
        return repository.findById(id);
    }

    public Collection save(Collection collection) {
        return repository.save(collection);
    }

    public Collection update(String id, Collection collection) {
        collection.setId(id);
        return repository.save(collection);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}