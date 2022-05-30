
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Pais;

import java.util.List;
import java.util.Optional;


public interface IPaisService {
    
    public List<Pais> listarPais();
    public void crearPais(Pais Pais);
    public void eliminarPais(Long id);
    public void actualizarPais(Pais Pais);
    public Optional<Pais> listarPaisPorId(Long id);
}
