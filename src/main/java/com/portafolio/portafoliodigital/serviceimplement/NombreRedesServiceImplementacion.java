
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.NombreRedes;
import com.portafolio.portafoliodigital.repository.NombreRedesRepository;
import com.portafolio.portafoliodigital.service.INombreRedesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombreRedesServiceImplementacion implements INombreRedesService{
    
     @Autowired
    private NombreRedesRepository nombreRedRepo;

    @Override
    public List<NombreRedes> getRedes() {
        return this.nombreRedRepo.findAll();
    }

    @Override
    public Optional<NombreRedes> buscarRedPorId(Long id) {
        return this.nombreRedRepo.findById(id);
    }
     
     
    
}
