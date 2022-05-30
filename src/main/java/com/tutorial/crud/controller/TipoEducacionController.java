
package com.tutorial.crud.controller;

import java.util.List;

import com.tutorial.crud.entity.TipoEducacion;
import com.tutorial.crud.service.ITipoEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "tipoeducacion")
@CrossOrigin(origins = "*")
public class TipoEducacionController {
    
    @Autowired
    private ITipoEducacionService serviceTipoEducacion;
    
     @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<TipoEducacion> listarTipoEducacion(){
        return serviceTipoEducacion.listarTipoEducacion();
    }
    
}
