package com.avaliacao.java.repositories;

import com.avaliacao.java.entity.Alunos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {
    
}
