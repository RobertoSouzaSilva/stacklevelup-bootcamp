package com.robertosouza.resourcesfullstack.repository;

import com.robertosouza.resourcesfullstack.domain.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    
}
