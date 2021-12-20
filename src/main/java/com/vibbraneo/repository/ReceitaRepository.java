package com.vibbraneo.repository;

import com.vibbraneo.domain.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
