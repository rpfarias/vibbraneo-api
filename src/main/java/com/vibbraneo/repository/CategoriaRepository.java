package com.vibbraneo.repository;

import com.vibbraneo.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Category, Long> {
}
