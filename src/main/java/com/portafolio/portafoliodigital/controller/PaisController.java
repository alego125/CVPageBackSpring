
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Pais;
import com.portafolio.portafoliodigital.service.IPaisService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "pais")
@RestController
class PaisController {
    
    @Autowired
    private IPaisService servicioPais;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pais> listarPaises(){
        return this.servicioPais.listarPais();
    }
    
    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Pais> listarPaisPorId(@PathVariable Long id){
        return this.servicioPais.listarPaisPorId(id);
    }
    
}
