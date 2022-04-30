
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Ciudad;
import java.util.List;

public interface ICiudadService {
    
    public List<Ciudad> listarCiudad();
    public void crearCiudad(Ciudad ciudad);
    public void eliminarCiudad(Long id);
    public void actualizarCiudad(Ciudad ciudad);
    public List<Ciudad> buscarPorProvincia(Long id);
    
}
