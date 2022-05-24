package com.avaliacao.java.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Alunos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dataNascimento")
    private LocalDateTime dataNascimento;

    @Column(name = "nomeResponsavel")
    private String nomeResponsavel;

    @Column(name = "telefoneContato")
    private String telefoneContato;

    @Column(name = "telefoneEmergencia")
    private String telefoneEmergencia;

    @Column(name = "restricoesAlimentares")
    private String restricoesAlimentares;

    public Alunos() {

    }

    public List<AlunosAutorizado> getListaAutorizados() {
        return listaAutorizados;
    }

    public void setListaAutorizados(List<AlunosAutorizado> listaAutorizados) {
        this.listaAutorizados = listaAutorizados;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    @Column(name = "autorizacaoImagem")
    private int autorizacaoImagem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(String telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public String getRestricoesAlimentares() {
        return restricoesAlimentares;
    }

    public void setRestricoesAlimentares(String restricoesAlimentares) {
        this.restricoesAlimentares = restricoesAlimentares;
    }

    public int getAutorizacaoImagem() {
        return autorizacaoImagem;
    }

    public void setAutorizacaoImagem(int autorizacaoImagem) {
        this.autorizacaoImagem = autorizacaoImagem;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAluno", referencedColumnName = "id")
    private List<AlunosAutorizado> listaAutorizados;

    @ManyToOne
    @JoinColumn(name = "idTurma", referencedColumnName = "id")
    private Turma turma;

    public Alunos(long id, String nome, LocalDateTime dataNascimento, String nomeResponsavel, String telefoneContato,
            String telefoneEmergencia, String restricoesAlimentares, int autorizacaoImagem,
            List<AlunosAutorizado> listaAutorizados, Turma turma, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nomeResponsavel = nomeResponsavel;
        this.telefoneContato = telefoneContato;
        this.telefoneEmergencia = telefoneEmergencia;
        this.restricoesAlimentares = restricoesAlimentares;
        this.autorizacaoImagem = autorizacaoImagem;
        this.listaAutorizados = listaAutorizados;
        this.turma = turma;
        this.observacoes = observacoes;
    }


    @Column(name = "observacoes")
    private String observacoes;
}
