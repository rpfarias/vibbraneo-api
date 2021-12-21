package com.vibbraneo.repository;

import com.vibbraneo.domain.model.Revenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Revenue, Long> {
}
