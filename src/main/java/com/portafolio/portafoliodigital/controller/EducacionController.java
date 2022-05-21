
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Educacion;
import com.portafolio.portafoliodigital.service.IEducacionService;
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

@RequestMapping(value = "educacion")
@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService serviceEducation;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Educacion> listarEducacion(){
        return this.serviceEducation.listarEduacion();
    }
    
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        return ResponseEntity.ok(this.serviceEducation.crearEduacion(educacion));
    }
    
    @DeleteMapping(value = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminarEducacion(@PathVariable Long id){
        try {
            this.serviceEducation.eliminarEduacion(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Educacion> actualizarEducacion(@RequestBody Educacion educacion){
        return ResponseEntity.ok(this.serviceEducation.crearEduacion(educacion));
    }
    
}
