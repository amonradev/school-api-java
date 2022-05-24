package com.avaliacao.java.services;

import java.util.List;

import com.avaliacao.java.entity.Alunos;
import com.avaliacao.java.repositories.AlunosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunosServices {
    @Autowired
    private AlunosRepository alunosRepository;

    public List<Alunos> getAllAlunos() {
        return this.alunosRepository.findAll();
    }

    public Alunos createAlunos(Alunos aluno) {
        return this.alunosRepository.save(aluno);
    }
    
    public void deleteAluno(long id) {
        this.alunosRepository.deleteById(id);
    }

    public Alunos updateAlunos(Alunos aluno) {
        return this.alunosRepository.save(aluno);
    }
}
