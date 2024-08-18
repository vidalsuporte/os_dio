package com.dev.agv.os.service;

import com.dev.agv.os.model.Servico;
import com.dev.agv.os.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

@Autowired
ServicoRepository ServicoRepository;

public void save(Servico servico){
    ServicoRepository.save(servico);
}

public void deleteById(Long id){
    ServicoRepository.deleteById(id);
}

public List<Servico> findAll(){
    return ServicoRepository.findAll();
}

public Servico findById(Long id){
    return ServicoRepository.findById(id).orElseThrow();
}

public  Servico findByNome(String nome){
    return ServicoRepository.findByNome(nome);
}



}
