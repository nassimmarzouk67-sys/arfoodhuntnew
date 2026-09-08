package org.example.arfoodhunt.service;

import lombok.RequiredArgsConstructor;
import org.example.arfoodhunt.entity.User;
import org.example.arfoodhunt.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(String id) {
        return repository.findById(id);
    }

    public User save(User user) {
        return repository.save(user);
    }

    public User update(String id, User user) {
        user.setId(id);
        return repository.save(user);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}