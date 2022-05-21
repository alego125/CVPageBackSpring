
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Institucion;
import com.portafolio.portafoliodigital.model.NombreRedes;
import com.portafolio.portafoliodigital.service.IInstitucionService;
import com.portafolio.portafoliodigital.service.INombreRedesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "nombreRedes")
@RestController
public class NombreRedesController {
    @Autowired
    private INombreRedesService serviceNombreRedes;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<NombreRedes>> listarInstitucion(){
        return ResponseEntity.ok(this.serviceNombreRedes.getRedes());
    }
    
    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<NombreRedes>> listarNombresPorId(@PathVariable Long id){
        return ResponseEntity.ok(this.serviceNombreRedes.buscarRedPorId(id));
    }
}
