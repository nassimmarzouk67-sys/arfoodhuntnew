package org.example.arfoodhunt.controller;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Event;
import org.example.arfoodhunt.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService service;


    @GetMapping
    public List<Event> getAll() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Event> getById(@PathVariable String id) {
        return service.findById(id);
    }


    @PostMapping
    public Event create(@RequestBody Event event) {
        return service.save(event);
    }


    @PutMapping("/{id}")
    public Event update(
            @PathVariable String id,
            @RequestBody Event event) {

        return service.update(id, event);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}