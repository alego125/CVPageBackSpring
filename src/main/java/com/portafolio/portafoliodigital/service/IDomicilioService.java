
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Domicilio;
import java.util.List;
import java.util.Optional;


public interface IDomicilioService {
    
    public List<Domicilio> listarDomicilio();
    public void crearDomicilio(Domicilio domicilio);
    public void eliminarDomicilio(Long id);
    public void actualizarDomicilio(Domicilio domicilio);
    public Optional<Domicilio> listarDomicilioPorId(Long id);
    
}
