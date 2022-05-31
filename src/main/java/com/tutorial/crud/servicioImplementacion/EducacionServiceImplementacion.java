
package com.tutorial.crud.servicioImplementacion;

import java.util.List;

import com.tutorial.crud.entity.Educacion;
import com.tutorial.crud.repository.EducacionRepository;
import com.tutorial.crud.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducacionServiceImplementacion implements IEducacionService {

    @Autowired
    private EducacionRepository educacionRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Educacion> listarEduacion() {
        return this.educacionRepo.findAll();
    }

    @Override
    @Transactional
    public Educacion crearEduacion(Educacion educacion) {
        return this.educacionRepo.save(educacion);
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
