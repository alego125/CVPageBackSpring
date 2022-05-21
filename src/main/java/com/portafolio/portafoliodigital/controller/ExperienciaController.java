
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Experiencia;
import com.portafolio.portafoliodigital.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "experiencia")
@RestController
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService serviceExperience;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Experiencia> listarExperiencia(){
        return this.serviceExperience.listarExperiencia();
    }
    
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(this.serviceExperience.crearExperiencia(experiencia));
    }
    
    @DeleteMapping(value = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminarExperiencia(@PathVariable Long id){
        try {
            this.serviceExperience.eliminarExperiencia(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Experiencia> actualizarExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(this.serviceExperience.actualizarExperiencia(experiencia));
    }
    
}
