package com.dev.agv.os.repository;

import com.dev.agv.os.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    public Cliente findByNome(String nome);


    public boolean existsByNome(String nome);
}
