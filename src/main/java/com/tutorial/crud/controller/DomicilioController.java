
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Domicilio;
import com.tutorial.crud.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "domicilio")
@CrossOrigin(origins = "*")
public class DomicilioController {
    
    @Autowired
    private IDomicilioService serviceDomicilio;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Domicilio> listarDomicilio(){
        return this.serviceDomicilio.listarDomicilio();
    }
    
    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Domicilio> listarDomicilioPorId(@PathVariable Long id){
        return this.serviceDomicilio.listarDomicilioPorId(id);
    }

    @PostMapping("agregarDomicilio")
    public void agregarDomicilio(@RequestBody Domicilio domicilio){
        serviceDomicilio.crearDomicilio(domicilio);
    }
    
}
