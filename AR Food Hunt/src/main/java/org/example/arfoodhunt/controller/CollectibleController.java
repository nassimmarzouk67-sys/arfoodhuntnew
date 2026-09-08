package org.example.arfoodhunt.controller;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Collectible;
import org.example.arfoodhunt.service.CollectibleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/collectibles")
@RequiredArgsConstructor
public class CollectibleController {

    private final CollectibleService service;


    @GetMapping
    public List<Collectible> getAll() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Collectible> getById(@PathVariable String id) {
        return service.findById(id);
    }


    @PostMapping
    public Collectible create(@RequestBody Collectible collectible) {
        return service.save(collectible);
    }


    @PutMapping("/{id}")
    public Collectible update(
            @PathVariable String id,
            @RequestBody Collectible collectible) {

        return service.update(id, collectible);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}