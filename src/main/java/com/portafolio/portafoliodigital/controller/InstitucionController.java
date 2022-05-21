
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Institucion;
import com.portafolio.portafoliodigital.service.IInstitucionService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "institucion")
@RestController
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
