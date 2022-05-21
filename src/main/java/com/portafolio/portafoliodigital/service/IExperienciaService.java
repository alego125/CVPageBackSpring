
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> listarExperiencia();
    public Experiencia crearExperiencia(Experiencia experiencia);
    public void eliminarExperiencia(Long id);
    public Experiencia actualizarExperiencia(Experiencia experiencia);
    
}
