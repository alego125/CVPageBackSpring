
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Red;
import com.tutorial.crud.entity.User;
import com.tutorial.crud.service.IRedService;
import com.tutorial.crud.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "red")
@CrossOrigin(origins = "*")
public class RedController {
    
    @Autowired
    private IRedService serviceRed;
    private IUsuarioService serviceUsuario;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Red> listarRedes(){
        return this.serviceRed.listarRedes();
    }

    @GetMapping(value = "getByUser/{id}")
    public ResponseEntity<Optional<List<Red>>> obtenerRedPorUsuario(@PathVariable("id") Long id){
        return ResponseEntity.ok(this.serviceRed.buscarPorUsuario(id));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Red> updateRed(@RequestBody Red red){
        return ResponseEntity.ok(this.serviceRed.actualizarRed(red));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Red> createRed(@RequestBody Red red){
        return ResponseEntity.ok(this.serviceRed.crearRed(red));
    }
    
}
