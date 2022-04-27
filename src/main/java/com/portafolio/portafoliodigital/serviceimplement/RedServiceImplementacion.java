
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Red;
import com.portafolio.portafoliodigital.repository.RedRepository;
import com.portafolio.portafoliodigital.service.IRedService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RedServiceImplementacion implements IRedService{

    @Autowired
    private RedRepository redRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Red> listarRedes() {
        return this.redRepo.findAll();
    }

    @Override
    @Transactional
    public void crearRed(Red red) {
        this.redRepo.save(red);
    }

    @Override
    @Transactional
    public void eliminarRed(Long id) {
        this.redRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarRed(Red red) {
        this.redRepo.save(red);
    }
    
}
