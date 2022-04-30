
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Pais;
import com.portafolio.portafoliodigital.service.IPaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pais")
@CrossOrigin(origins = "http://localhost:4200")
public class PaisController {
    
    @Autowired
    private IPaisService servicioPais;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    @Transactional(readOnly = true)
    public List<Pais> obtenerPaises(){
        return this.servicioPais.listarPais();
    }
    
}
