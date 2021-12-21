package com.vibbraneo.controller;

import com.vibbraneo.domain.model.User;
import com.vibbraneo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAll() { return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable(value = "id") Long id) {
        return userRepository.findById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody User user) {
        userRepository.delete(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userRepository.save(user);
    }
}
