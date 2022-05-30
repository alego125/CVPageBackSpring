
package com.tutorial.crud.controller;

import java.util.List;

import com.tutorial.crud.entity.Experiencia;
import com.tutorial.crud.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "experiencia")
@CrossOrigin(origins = "*")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService serviceExperience;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Experiencia> listarExperiencia(){
        return this.serviceExperience.listarExperiencia();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(this.serviceExperience.crearExperiencia(experiencia));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(value = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminarExperiencia(@PathVariable Long id){
        try {
            this.serviceExperience.eliminarExperiencia(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Experiencia> actualizarExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(this.serviceExperience.actualizarExperiencia(experiencia));
    }
    
}
