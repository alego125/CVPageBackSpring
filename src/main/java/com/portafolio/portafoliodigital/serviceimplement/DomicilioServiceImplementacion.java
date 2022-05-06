
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Domicilio;
import com.portafolio.portafoliodigital.repository.DomicilioRepository;
import com.portafolio.portafoliodigital.service.IDomicilioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DomicilioServiceImplementacion implements IDomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Domicilio> listarDomicilio() {
        return this.domicilioRepo.findAll();
    }

    @Override
    @Transactional
    public void crearDomicilio(Domicilio domicilio) {
        this.domicilioRepo.save(domicilio);
    }

    @Override
    @Transactional
    public void eliminarDomicilio(Long id) {
        this.domicilioRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarDomicilio(Domicilio domicilio) {
        this.domicilioRepo.save(domicilio);
    }

    @Override
    public Optional<Domicilio> listarDomicilioPorId(Long id) {
        return this.domicilioRepo.findById(id);
    }
    
}
