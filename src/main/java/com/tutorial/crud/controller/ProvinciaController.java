
package com.tutorial.crud.controller;

import java.util.List;

import com.tutorial.crud.entity.Provincia;
import com.tutorial.crud.service.IProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "provincia")
@CrossOrigin(origins = "*")
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
