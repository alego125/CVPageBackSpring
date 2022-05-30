
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Institucion;
import com.tutorial.crud.service.IInstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "institucion")
@CrossOrigin(origins = "*")
public class InstitucionController {
    
    @Autowired
    private IInstitucionService serviceInstitution;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Institucion> listarInstitucion(){
        return this.serviceInstitution.listarInstitucion();
    }
    
    @GetMapping(value = "searchById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Institucion>> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(this.serviceInstitution.buscarInstitucionPorId(id));
    }
    
}
