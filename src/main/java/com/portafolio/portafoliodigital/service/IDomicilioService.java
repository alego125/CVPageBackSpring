
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Domicilio;
import java.util.List;


public interface IDomicilioService {
    
    public List<Domicilio> listarDomicilio();
    public void crearDomicilio(Domicilio domicilio);
    public void eliminarDomicilio(Long id);
    public void actualizarDomicilio(Domicilio domicilio);
    
}
