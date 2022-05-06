
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Domicilio;
import com.portafolio.portafoliodigital.service.IDomicilioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "domicilio")
@RestController
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
    
}
