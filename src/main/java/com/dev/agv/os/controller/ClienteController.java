package com.dev.agv.os.controller;

import com.dev.agv.os.model.Cliente;
import com.dev.agv.os.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
@Autowired
    ClienteService clienteService;

    Cliente cliente = new Cliente();

@PostMapping
public void save( @RequestBody Cliente cliente){
    clienteService.save(cliente);
}

@GetMapping("/all")
    public List<Cliente> findAll(){
    return clienteService.findAll();
}

@GetMapping("/{id}")
    public Cliente findById(@PathVariable Long id){
    return clienteService.findById(id);
}

@GetMapping("/usuario/{nome}")
    public  Cliente findByNome(@PathVariable String nome){
    return clienteService.findByNome(nome);
}

@DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
    clienteService.deleteById(id);

}



}
