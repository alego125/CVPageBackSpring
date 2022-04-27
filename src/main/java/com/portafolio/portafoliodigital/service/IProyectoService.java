
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> listarProyectos();
    public void crearProyecto(Proyecto proyecto);
    public void eliminarProyecto(Long id);
    public void actualizarProyecto(Proyecto proyecto);
    
}
