
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> listarExperiencia();
    public void crearExperiencia(Experiencia experiencia);
    public void eliminarExperiencia(Long id);
    public void actualizarExperiencia(Experiencia experiencia);
    
}
