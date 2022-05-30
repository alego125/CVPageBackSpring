
package com.tutorial.crud.service;

import com.tutorial.crud.entity.NombreRedes;

import java.util.List;
import java.util.Optional;


public interface INombreRedesService {
    
    public List<NombreRedes> getRedes();
    public Optional<NombreRedes> buscarRedPorId(Long id);
    
}
