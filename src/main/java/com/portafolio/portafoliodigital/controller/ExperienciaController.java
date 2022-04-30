
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Experiencia;
import com.portafolio.portafoliodigital.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
