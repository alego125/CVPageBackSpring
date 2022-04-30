
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.TipoEducacion;
import com.portafolio.portafoliodigital.service.ITipoEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "tipoeducacion")
@RestController
public class TipoEducacionController {
    
    @Autowired
    private ITipoEducacionService serviceTipoEducacion;
    
     @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<TipoEducacion> listarTipoEducacion(){
        return serviceTipoEducacion.listarTipoEducacion();
    }
    
}
