package com.dev.agv.os.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Servico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servico_id")
    private Long id;
    private String nome;
    private Double valor;
    private String descricao;
    private int quantidade;

    public Servico(Long id, String nome, Double valor, String descricao, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Servico() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
