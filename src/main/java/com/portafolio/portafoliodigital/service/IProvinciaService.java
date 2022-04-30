
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Provincia;
import java.util.List;

public interface IProvinciaService {
    
    public List<Provincia> listarProvincia();
    public void crearProvincia(Provincia provincia);
    public void eliminarProvincia(Long id);
    public void actualizarProvincia(Provincia provincia);
    public Provincia obtenerPorId(Long id);
    
}
