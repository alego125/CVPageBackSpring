
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Red;
import com.portafolio.portafoliodigital.service.IRedService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "red")
@RestController
public class RedController {
    
    @Autowired
    private IRedService serviceRed;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Red> listarRedes(){
        return this.serviceRed.listarRedes();
    }
    
}
