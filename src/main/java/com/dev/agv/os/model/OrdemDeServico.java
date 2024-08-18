package com.dev.agv.os.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OrdemDeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordemDeServico_id")
    private Long id;
    private LocalDate dataOS;
    private LocalDate dataPrevisao;
    private LocalDate dataEntrega;

    @ManyToOne(fetch = FetchType.EAGER)
    Cliente cliente;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_servico_ordemDeServico",
            joinColumns = @JoinColumn(name = "ordemDeServico_id"),
            inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
    private Set<Servico> servicoSet = new HashSet<>();

    public OrdemDeServico(Long id, LocalDate dataOS, LocalDate dataPrevisao, LocalDate dataEntrega, Cliente cliente, Set<Servico> servicoSet) {
        this.id = id;
        this.dataOS = dataOS;
        this.dataPrevisao = dataPrevisao;
        this.dataEntrega = dataEntrega;
        this.cliente = cliente;
        this.servicoSet = servicoSet;
    }

    public OrdemDeServico() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataOS() {
        return dataOS;
    }

    public void setDataOS(LocalDate dataOS) {
        this.dataOS = dataOS;
    }

    public LocalDate getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(LocalDate dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Servico> getServicoSet() {
        return servicoSet;
    }

    public void setServicoSet(Set<Servico> servicoSet) {
        this.servicoSet = servicoSet;
    }
}
