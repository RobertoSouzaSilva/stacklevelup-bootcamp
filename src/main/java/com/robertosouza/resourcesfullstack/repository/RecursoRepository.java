package com.robertosouza.resourcesfullstack.repository;

import com.robertosouza.resourcesfullstack.domain.Recurso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    
}
