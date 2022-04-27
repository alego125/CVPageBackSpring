
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Educacion;
import com.portafolio.portafoliodigital.repository.EducacionRepository;
import com.portafolio.portafoliodigital.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducacionServiceImplementacion implements IEducacionService{

    @Autowired
    private EducacionRepository educacionRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Educacion> listarEduacion() {
        return this.educacionRepo.findAll();
    }

    @Override
    @Transactional
    public void crearEduacion(Educacion educacion) {
        this.educacionRepo.save(educacion);
    }

    @Override
    @Transactional
    public void eliminarEduacion(Long id) {
        this.educacionRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarEduacion(Educacion educacion) {
        this.educacionRepo.save(educacion);
    }
    
}
