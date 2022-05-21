
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> listarEduacion();
    public Educacion crearEduacion(Educacion educacion);
    public void eliminarEduacion(Long id);
    public void actualizarEduacion(Educacion educacion);
    
}
