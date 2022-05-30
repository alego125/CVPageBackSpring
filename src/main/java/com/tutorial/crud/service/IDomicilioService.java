
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Domicilio;

import java.util.List;
import java.util.Optional;


public interface IDomicilioService {
    
    List<Domicilio> listarDomicilio();
    Domicilio crearDomicilio(Domicilio domicilio);
    void eliminarDomicilio(Long id);
    void actualizarDomicilio(Domicilio domicilio);
    Optional<Domicilio> listarDomicilioPorId(Long id);
    
}
