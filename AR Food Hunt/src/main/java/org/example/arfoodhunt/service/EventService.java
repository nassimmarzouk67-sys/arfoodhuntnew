package org.example.arfoodhunt.service;


import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Event;
import org.example.arfoodhunt.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository repository;

    public List<Event> findAll() {
        return repository.findAll();
    }

    public Optional<Event> findById(String id) {
        return repository.findById(id);
    }

    public Event save(Event event) {
        return repository.save(event);
    }

    public Event update(String id, Event event) {
        event.setId(id);
        return repository.save(event);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}