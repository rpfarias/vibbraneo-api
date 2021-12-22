package com.vibbraneo.controller;

import com.vibbraneo.domain.model.Category;
import com.vibbraneo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @GetMapping
    public List<Category> getAll(@RequestParam(value = "name", required = false) String name) {
        if (name != null) {
            return categoryRepository.findAllByNameContaining(name);
        } else {
            return categoryRepository.findAll();
        }
    }

    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable(value = "id") Long id) {
        return categoryRepository.findById(id);
    }

    @PutMapping("/{id}/archive")// Esse não entendi
    public Category update(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @PutMapping("/{id}")
    public void updateDescription(@RequestBody Category category) {
        categoryRepository.save(category);
    }
}
