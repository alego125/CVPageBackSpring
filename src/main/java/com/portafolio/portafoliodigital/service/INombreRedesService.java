
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.NombreRedes;
import java.util.List;
import java.util.Optional;


public interface INombreRedesService {
    
    public List<NombreRedes> getRedes();
    public Optional<NombreRedes> buscarRedPorId(Long id);
    
}
