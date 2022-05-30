
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Experiencia;

import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> listarExperiencia();
    public Experiencia crearExperiencia(Experiencia experiencia);
    public void eliminarExperiencia(Long id);
    public Experiencia actualizarExperiencia(Experiencia experiencia);
    
}
