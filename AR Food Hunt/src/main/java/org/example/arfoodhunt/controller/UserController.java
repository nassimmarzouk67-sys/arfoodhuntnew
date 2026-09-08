package org.example.arfoodhunt.controller;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.User;
import org.example.arfoodhunt.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;


    // Afficher tous les utilisateurs
    @GetMapping
    public List<User> getAllUsers() {
        return service.findAll();
    }


    // Afficher un utilisateur par id
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return service.findById(id);
    }


    // Ajouter un utilisateur
    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.save(user);
    }


    // Modifier un utilisateur
    @PutMapping("/{id}")
    public User updateUser(
            @PathVariable String id,
            @RequestBody User user) {

        return service.update(id, user);
    }


    // Supprimer un utilisateur
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        service.delete(id);
    }
}