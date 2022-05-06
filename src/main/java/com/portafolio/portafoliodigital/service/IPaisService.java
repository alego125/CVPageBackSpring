
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Pais;
import java.util.List;
import java.util.Optional;


public interface IPaisService {
    
    public List<Pais> listarPais();
    public void crearPais(Pais Pais);
    public void eliminarPais(Long id);
    public void actualizarPais(Pais Pais);
    public Optional<Pais> listarPaisPorId(Long id);
}
