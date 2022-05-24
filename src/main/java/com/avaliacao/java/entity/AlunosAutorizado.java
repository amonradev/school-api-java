package com.avaliacao.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AlunosAutorizadoId.class)
public class AlunosAutorizado {
    
    @Id
    // @Column(name = "idAluno")
    private long id;

    @Id
    // @Column(name = "idAutorizado")
    private long idAutorizado;

    public String grauParentesco;
}
