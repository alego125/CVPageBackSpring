
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Institucion;
import java.util.List;
import java.util.Optional;


public interface IInstitucionService {
    
    public List<Institucion> listarInstitucion();
    public Optional<Institucion> buscarInstitucionPorId(Long id);
    public void crearInstitucion(Institucion experiencia);
    public void eliminarInstitucion(Long id);
    public void actualizarInstitucion(Institucion experiencia);
    
}
