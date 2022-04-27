
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Educacion;
import com.portafolio.portafoliodigital.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "educacion")
@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService serviceEducation;
    
    @GetMapping(value = "getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Educacion> listarEducacion(){
        return this.serviceEducation.listarEduacion();
    }
    
}
