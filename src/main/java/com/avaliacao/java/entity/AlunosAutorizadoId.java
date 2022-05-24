package com.avaliacao.java.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AlunosAutorizadoId implements Serializable {
    
    private long id;
    private long idAutorizado;
}
