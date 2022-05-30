
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Ciudad;
import com.tutorial.crud.service.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "ciudad")
@CrossOrigin(origins = "*")
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
