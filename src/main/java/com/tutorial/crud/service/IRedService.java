
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Red;
import com.tutorial.crud.entity.User;

import java.util.List;
import java.util.Optional;


public interface IRedService {

    List<Red> listarRedes();
    Red crearRed(Red red);
    void eliminarRed(Long id);
    Red actualizarRed(Red red);

    Optional<List<Red>> buscarPorUsuario(Long id);

}
