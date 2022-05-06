
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Pais;
import com.portafolio.portafoliodigital.repository.PaisRespository;
import com.portafolio.portafoliodigital.service.IPaisService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImplementacion implements IPaisService{
    
    @Autowired
    private PaisRespository paisRepo;

    @Override
    public List<Pais> listarPais() {
        return paisRepo.findAll();
    }

    @Override
    public void crearPais(Pais Pais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPais(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarPais(Pais Pais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Pais> listarPaisPorId(Long id) {
        return this.paisRepo.findById(id);
    }
    
    
    
}
