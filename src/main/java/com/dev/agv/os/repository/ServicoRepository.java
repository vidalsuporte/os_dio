package com.dev.agv.os.repository;


import com.dev.agv.os.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

    public Servico findByNome(String nome);


}
