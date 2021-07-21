package com.robertosouza.resourcesfullstack.repository;

import com.robertosouza.resourcesfullstack.domain.Disciplina;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    
}
