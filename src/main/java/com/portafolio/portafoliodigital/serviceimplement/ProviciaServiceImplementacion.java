
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Provincia;
import com.portafolio.portafoliodigital.repository.ProvinciaRepository;
import com.portafolio.portafoliodigital.service.IProvinciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProviciaServiceImplementacion implements IProvinciaService{
    
    @Autowired
    private ProvinciaRepository provinciaRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Provincia> listarProvincia() {
        return this.provinciaRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Provincia obtenerPorId(Long id) {
       return this.provinciaRepo.findById(id).orElse(null);
    }
    
    @Override
    public void crearProvincia(Provincia provincia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarProvincia(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarProvincia(Provincia provincia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
