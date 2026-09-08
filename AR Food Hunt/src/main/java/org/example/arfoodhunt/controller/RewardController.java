package org.example.arfoodhunt.controller;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.Reward;
import org.example.arfoodhunt.service.RewardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rewards")
@RequiredArgsConstructor
public class RewardController {

    private final RewardService service;


    @GetMapping
    public List<Reward> getAll() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Reward> getById(@PathVariable String id) {
        return service.findById(id);
    }


    @PostMapping
    public Reward create(@RequestBody Reward reward) {
        return service.save(reward);
    }


    @PutMapping("/{id}")
    public Reward update(
            @PathVariable String id,
            @RequestBody Reward reward) {

        return service.update(id, reward);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}