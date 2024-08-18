package com.dev.agv.os.repository;

import com.dev.agv.os.model.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long> {

public List<OrdemDeServico>  findByDataOS(LocalDate dataOS);

}
