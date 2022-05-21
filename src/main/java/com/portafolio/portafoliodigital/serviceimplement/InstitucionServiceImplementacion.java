
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Institucion;
import com.portafolio.portafoliodigital.repository.InstitucionRepository;
import com.portafolio.portafoliodigital.service.IInstitucionService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InstitucionServiceImplementacion implements IInstitucionService{
  
    @Autowired
    private InstitucionRepository intitucionRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Institucion> listarInstitucion() {
        return this.intitucionRepo.findAll();
    }

    @Override
    @Transactional
    public void crearInstitucion(Institucion experiencia) {
        this.intitucionRepo.save(experiencia);
    }

    @Override
    @Transactional
    public void eliminarInstitucion(Long id) {
        this.intitucionRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarInstitucion(Institucion experiencia) {
        this.intitucionRepo.save(experiencia);
    }

    @Override
    public Optional<Institucion> buscarInstitucionPorId(Long id) {
        return this.intitucionRepo.findById(id);
    }
    
}
