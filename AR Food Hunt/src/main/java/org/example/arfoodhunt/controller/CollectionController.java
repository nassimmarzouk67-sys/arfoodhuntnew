package org.example.arfoodhunt.controller;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Collection;
import org.example.arfoodhunt.service.CollectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/collections")
@RequiredArgsConstructor
public class CollectionController {

    private final CollectionService service;


    @GetMapping
    public List<Collection> getAll() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Collection> getById(@PathVariable String id) {
        return service.findById(id);
    }


    @PostMapping
    public Collection create(@RequestBody Collection collection) {
        return service.save(collection);
    }


    @PutMapping("/{id}")
    public Collection update(
            @PathVariable String id,
            @RequestBody Collection collection) {

        return service.update(id, collection);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}