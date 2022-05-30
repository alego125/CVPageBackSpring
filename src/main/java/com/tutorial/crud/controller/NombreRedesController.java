
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.NombreRedes;
import com.tutorial.crud.service.INombreRedesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "nombreRedes")
@CrossOrigin(origins = "*")
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
