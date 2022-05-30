
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Pais;
import com.tutorial.crud.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "pais")
@CrossOrigin(origins = "*")
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
