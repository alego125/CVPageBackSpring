
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.TipoEducacion;
import java.util.List;


public interface ITipoEducacionService {
    
    public List<TipoEducacion> listarTipoEducacion();
    public void crearTipoEducacion(TipoEducacion tipoEducacion);
    public void eliminarTipoEducacion(Long id);
    public void actualizarTipoEducacion(TipoEducacion tipoEducacion);
    
}
