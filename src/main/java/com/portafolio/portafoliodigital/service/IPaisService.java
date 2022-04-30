
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Pais;
import java.util.List;


public interface IPaisService {
    
    public List<Pais> listarPais();
    public void crearPais(Pais Pais);
    public void eliminarPais(Long id);
    public void actualizarPais(Pais Pais);
    
}
