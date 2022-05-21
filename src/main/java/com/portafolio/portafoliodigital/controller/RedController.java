
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Red;
import com.portafolio.portafoliodigital.service.IRedService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "red")
@RestController
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
