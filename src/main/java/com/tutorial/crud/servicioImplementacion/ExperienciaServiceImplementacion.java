
package com.tutorial.crud.servicioImplementacion;

import java.util.List;

import com.tutorial.crud.entity.Experiencia;
import com.tutorial.crud.repository.ExperienciaRepository;
import com.tutorial.crud.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienciaServiceImplementacion implements IExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Experiencia> listarExperiencia() {
        return this.experienciaRepo.findAll();
    }

    @Override
    @Transactional
    public Experiencia crearExperiencia(Experiencia experiencia) {
        return this.experienciaRepo.save(experiencia);
    }

    @Override
    @Transactional
    public void eliminarExperiencia(Long id) {
        this.experienciaRepo.deleteById(id);
    }

    @Override
    @Transactional
    public Experiencia actualizarExperiencia(Experiencia experiencia) {
       return this.experienciaRepo.save(experiencia);
    }
    
}
