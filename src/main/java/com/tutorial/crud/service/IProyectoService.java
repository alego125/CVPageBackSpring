
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Proyecto;

import java.util.List;
import java.util.Optional;


public interface IProyectoService {
    
    public List<Proyecto> listarProyectos();
    public Proyecto crearProyecto(Proyecto proyecto);
    public Optional<Proyecto> buscarProyectoPorId(Long id);
    public Optional<Proyecto> eliminarProyecto(Long id);
    public Proyecto actualizarProyecto(Proyecto proyecto);
    
}
