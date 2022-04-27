
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.TipoEducacion;
import com.portafolio.portafoliodigital.repository.TipoEducacionRepository;
import com.portafolio.portafoliodigital.service.ITipoEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TipoEducacionServiceImplementacion implements ITipoEducacionService{
    
    @Autowired    
    private TipoEducacionRepository serviceTipoEducacion;

    @Override
    @Transactional(readOnly = true)
    public List<TipoEducacion> listarTipoEducacion() {
        return this.serviceTipoEducacion.findAll();
    }

    @Override
    @Transactional
    public void crearTipoEducacion(TipoEducacion tipoEducacion) {
        this.serviceTipoEducacion.save(tipoEducacion);
    }

    @Override
    @Transactional
    public void eliminarTipoEducacion(Long id) {
        this.serviceTipoEducacion.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarTipoEducacion(TipoEducacion tipoEducacion) {
        this.serviceTipoEducacion.save(tipoEducacion);
    }
    
    
    
}
