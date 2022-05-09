
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Ciudad;
import com.portafolio.portafoliodigital.service.ICiudadService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ciudad")
public class CiudadController {
    
    @Autowired
    private ICiudadService servicioCiudad;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ciudad> obtenerCiudad(){
        return this.servicioCiudad.listarCiudad();
    }
    
    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Ciudad> listarCiudadPorId(@PathVariable Long id){
        return this.servicioCiudad.listarCiudadPorId(id);
    }
    
    @GetMapping(value = "getByCiudad/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ciudad> obtenerCiudadPorProvincia(@PathVariable Long id){
        return this.servicioCiudad.buscarPorProvincia(id); 
    }
}
