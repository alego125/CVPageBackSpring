
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Red;
import java.util.List;


public interface IRedService {

    public List<Red> listarRedes();
    public void crearRed(Red red);
    public void eliminarRed(Long id);
    public void actualizarRed(Red red);
    
}
