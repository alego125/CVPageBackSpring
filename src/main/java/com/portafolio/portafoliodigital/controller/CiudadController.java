
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Ciudad;
import com.portafolio.portafoliodigital.service.ICiudadService;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ciudad")
@CrossOrigin(origins = "http://localhost:4200")
public class CiudadController {
    
    @Autowired
    private ICiudadService servicioCiudad;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ciudad> obtenerCiudad(){
        return this.servicioCiudad.listarCiudad();
    }
    
    @GetMapping(value = "getByCiudad/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ciudad> obtenerCiudadPorProvincia(@PathVariable Long id){
        return this.servicioCiudad.buscarPorProvincia(id); 
    }
}
