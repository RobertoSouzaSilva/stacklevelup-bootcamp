package com.robertosouza.resourcesfullstack.repository;

import com.robertosouza.resourcesfullstack.domain.Questao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
    
}
