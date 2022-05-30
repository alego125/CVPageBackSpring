
package com.tutorial.crud.controller;

import java.util.List;

import com.tutorial.crud.entity.Red;
import com.tutorial.crud.service.IRedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "red")
@CrossOrigin(origins = "*")
public class RedController {
    
    @Autowired
    private IRedService serviceRed;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Red> listarRedes(){
        return this.serviceRed.listarRedes();
    }
    
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Red> updateRed(@RequestBody Red red){
        return ResponseEntity.ok(this.serviceRed.actualizarRed(red));
    }
    
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Red> createRed(@RequestBody Red red){
        return ResponseEntity.ok(this.serviceRed.crearRed(red));
    }
    
}
