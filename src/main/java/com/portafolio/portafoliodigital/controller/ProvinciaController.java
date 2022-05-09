
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Provincia;
import com.portafolio.portafoliodigital.service.IProvinciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "provincia")
public class ProvinciaController {
    
    @Autowired
    private IProvinciaService serviceProvince;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Provincia> listarProvincia(){
        return this.serviceProvince.listarProvincia();
    }
    
    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Provincia obtenerPorId(@PathVariable Long id){
        return this.serviceProvince.obtenerPorId(id);
    }
    
}
