package com.vibbraneo.controller;

import com.vibbraneo.domain.model.Category;
import com.vibbraneo.repository.CategoryCustomRepository;
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

    @Autowired
    CategoryCustomRepository categoryCustomRepository;

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @GetMapping
    public List<Category> getAll() { return categoryRepository.findAll(); }

    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable(value = "id") Long id) {
        return categoryRepository.findById(id);
    }

    @GetMapping("/{name}")
    public List<Category> getByName(@PathVariable(value = "name") String name) {
        return categoryCustomRepository.findByNameLike(name);
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
