package com.dev.agv.os.controller;

import com.dev.agv.os.model.OrdemDeServico;
import com.dev.agv.os.model.Servico;
import com.dev.agv.os.service.OrdemDeServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ordensdeservico")
public class OrdemDeServicoController {

    @Autowired
    OrdemDeServicoService ordemDeServicoService;

    OrdemDeServico ordemDeServico = new OrdemDeServico();

@PostMapping
public void save( @RequestBody OrdemDeServico ordemDeServico){
     ordemDeServicoService.save(ordemDeServico);
}

@GetMapping("/all")
    public List<OrdemDeServico> findAll(){
    return ordemDeServicoService.findAll();
}

@GetMapping("/{id}")
    public OrdemDeServico findById(@PathVariable Long id){
    return ordemDeServicoService.findById(id);
}

@GetMapping("/servico/{dataStr}")

    public  List<OrdemDeServico> findByDataOS(@PathVariable String dataStr){



    return  ordemDeServicoService.findByDataOS(dataStr);
}

@DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
    ordemDeServicoService.deleteById(id);

}



}
