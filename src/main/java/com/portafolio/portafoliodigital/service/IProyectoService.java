
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Proyecto;
import java.util.List;
import java.util.Optional;


public interface IProyectoService {
    
    public List<Proyecto> listarProyectos();
    public Proyecto crearProyecto(Proyecto proyecto);
    public Optional<Proyecto> buscarProyectoPorId(Long id);
    public Optional<Proyecto> eliminarProyecto(Long id);
    public Proyecto actualizarProyecto(Proyecto proyecto);
    
}
