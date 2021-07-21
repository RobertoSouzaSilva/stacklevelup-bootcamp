package com.robertosouza.resourcesfullstack.repository;

import com.robertosouza.resourcesfullstack.domain.Prova;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvaRepository extends JpaRepository<Prova, Long> {
    
}
