
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Proyecto;
import com.portafolio.portafoliodigital.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "proyecto")
@RestController
public class ProyectoController {
    
    @Autowired
    private IProyectoService serviceProyect;
    
    @GetMapping(value = "getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Proyecto> listarProyectos(){
        return this.serviceProyect.listarProyectos();
    }
    
}
