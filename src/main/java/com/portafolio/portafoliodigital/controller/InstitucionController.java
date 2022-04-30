
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Institucion;
import com.portafolio.portafoliodigital.service.IInstitucionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
