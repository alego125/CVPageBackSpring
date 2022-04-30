
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Ciudad;
import com.portafolio.portafoliodigital.repository.CiudadRepository;
import com.portafolio.portafoliodigital.service.ICiudadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CiudadServiceImplementacion implements ICiudadService{

    @Autowired
    private CiudadRepository ciudadRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> listarCiudad() {
        return this.ciudadRepo.findAll();
    }

    @Override
    public void crearCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCiudad(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ciudad> buscarPorProvincia(Long id) {
        return this.ciudadRepo.obtenerCiudadPorProvincia(id);
    }
    
}
