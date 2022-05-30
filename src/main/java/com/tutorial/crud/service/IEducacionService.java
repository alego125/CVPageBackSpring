
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Educacion;

import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> listarEduacion();
    public Educacion crearEduacion(Educacion educacion);
    public void eliminarEduacion(Long id);
    public void actualizarEduacion(Educacion educacion);
    
}
