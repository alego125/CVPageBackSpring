
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Proyecto;
import com.portafolio.portafoliodigital.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "proyecto")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired
    private IProyectoService serviceProyect;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Proyecto> listarProyectos(){
        return this.serviceProyect.listarProyectos();
    }
    
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
        return ResponseEntity.ok(this.serviceProyect.crearProyecto(proyecto));
    }
    
}
