package com.robertosouza.resourcesfullstack.repository;

import com.robertosouza.resourcesfullstack.domain.ProcessoSeletivo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessoSeletivoRepository extends JpaRepository<ProcessoSeletivo, Long> {
    
}
