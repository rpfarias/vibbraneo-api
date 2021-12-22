package com.vibbraneo.repository;

import com.vibbraneo.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface CategoryCustomRepository extends JpaRepository<Category, Serializable> {
    List<Category> findByNameLike(String name);
}
