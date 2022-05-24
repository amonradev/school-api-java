package com.avaliacao.java.controllers;

import java.util.List;

import com.avaliacao.java.entity.Alunos;
import com.avaliacao.java.repositories.AlunosRepository;
import com.avaliacao.java.services.AlunosServices;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@Controller
@RequestMapping("/amorinha/alunos")
public class AlunosController {
    
    @Autowired
    private AlunosServices alunosServices;

    @GetMapping
    public ResponseEntity<List<Alunos>> buscarAlunos() {
        return new ResponseEntity<>(alunosServices.getAllAlunos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> criaAluno(@RequestBody Alunos aluno) {
        alunosServices.createAlunos(aluno);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exluirAluno(@PathVariable ("id") long id) {
        alunosServices.deleteAluno(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Void> updateAluno(@RequestBody Alunos aluno) {
        alunosServices.updateAlunos(aluno);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
