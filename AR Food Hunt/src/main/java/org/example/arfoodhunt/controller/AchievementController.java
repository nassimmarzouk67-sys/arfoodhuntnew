package org.example.arfoodhunt.controller;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Achievement;
import org.example.arfoodhunt.service.AchievementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/achievements")
@RequiredArgsConstructor
public class AchievementController {

    private final AchievementService service;


    @GetMapping
    public List<Achievement> getAll() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Achievement> getById(@PathVariable String id) {
        return service.findById(id);
    }


    @PostMapping
    public Achievement create(@RequestBody Achievement achievement) {
        return service.save(achievement);
    }


    @PutMapping("/{id}")
    public Achievement update(
            @PathVariable String id,
            @RequestBody Achievement achievement) {

        return service.update(id, achievement);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}