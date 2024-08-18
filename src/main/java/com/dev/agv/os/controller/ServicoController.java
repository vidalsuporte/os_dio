package com.dev.agv.os.controller;

import com.dev.agv.os.model.Cliente;
import com.dev.agv.os.model.Servico;
import com.dev.agv.os.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {
@Autowired
    ServicoService servicoService;

    Servico servico = new Servico();

@PostMapping
public void save( @RequestBody Servico servico){
    servicoService.save(servico);
}

@GetMapping("/all")
    public List<Servico> findAll(){
    return servicoService.findAll();
}

@GetMapping("/{id}")
    public Servico findById(@PathVariable Long id){
    return servicoService.findById(id);
}

@GetMapping("/servico/{nome}")
    public  Servico findByNome(@PathVariable String nome){
    return servicoService.findByNome(nome);
}

@DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
    servicoService.deleteById(id);

}



}
