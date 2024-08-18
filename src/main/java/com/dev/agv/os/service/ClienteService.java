package com.dev.agv.os.service;

import com.dev.agv.os.model.Cliente;
import com.dev.agv.os.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;




    public void save(Cliente cliente){

        clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){

        return clienteRepository.findAll();
    }

    public Cliente findById(Long id){
        return clienteRepository.findById(id).orElseThrow();
    }

    public  Cliente findByNome(String nome){
        return clienteRepository.findByNome(nome);
    }

    public void deleteById(Long id){
        clienteRepository.deleteById(id);
    }
}
