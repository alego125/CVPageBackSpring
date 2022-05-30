
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Red;

import java.util.List;


public interface IRedService {

    public List<Red> listarRedes();
    public Red crearRed(Red red);
    public void eliminarRed(Long id);
    public Red actualizarRed(Red red);
    
}
