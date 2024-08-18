package com.dev.agv.os.service;

import com.dev.agv.os.model.OrdemDeServico;
import com.dev.agv.os.model.Servico;
import com.dev.agv.os.repository.OrdemDeServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.IllegalFormatException;
import java.util.List;

@Service
public class OrdemDeServicoService {

@Autowired
OrdemDeServicoRepository ordemDeServicoRepository;

public void save(OrdemDeServico ordemDeServico){
    ordemDeServicoRepository.save(ordemDeServico);
}

public void deleteById(Long id){
    ordemDeServicoRepository.deleteById(id);
}

public List<OrdemDeServico> findAll(){
    return ordemDeServicoRepository.findAll();
}

public OrdemDeServico findById(Long id){
    return ordemDeServicoRepository.findById(id).orElseThrow();
}

public  List<OrdemDeServico> findByDataOS(String dataStr) throws IllegalFormatException {
           LocalDate dataOS = LocalDate.parse(dataStr);
       return ordemDeServicoRepository.findByDataOS(dataOS);
}


}
