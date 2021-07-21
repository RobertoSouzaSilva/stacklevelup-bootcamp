package com.robertosouza.resourcesfullstack.repository;

import com.robertosouza.resourcesfullstack.domain.Candidato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
    
}
