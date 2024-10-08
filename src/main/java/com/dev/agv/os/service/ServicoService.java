package com.dev.agv.os.service;

import com.dev.agv.os.model.Servico;
import com.dev.agv.os.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

@Autowired
ServicoRepository servicoRepository;

public void save(Servico servico){
    if(servicoRepository.existsByNome(servico.getNome())){
        throw new IllegalArgumentException();
    }else {
        servicoRepository.save(servico);
    }
    }

public void deleteById(Long id){
    servicoRepository.deleteById(id);
}

public List<Servico> findAll(){
    return servicoRepository.findAll();
}

public Servico findById(Long id){
    return servicoRepository.findById(id).orElseThrow();
}

public  Servico findByNome(String nome){
    return servicoRepository.findByNome(nome);
}



}
