
package com.tutorial.crud.servicioImplementacion;

import java.util.List;

import com.tutorial.crud.entity.Red;
import com.tutorial.crud.repository.RedRepository;
import com.tutorial.crud.service.IRedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RedServiceImplementacion implements IRedService {

    @Autowired
    private RedRepository redRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Red> listarRedes() {
        return this.redRepo.findAll();
    }

    @Override
    @Transactional
    public Red crearRed(Red red) {
       return this.redRepo.save(red);
    }

    @Override
    @Transactional
    public void eliminarRed(Long id) {
        this.redRepo.deleteById(id);
    }

    @Override
    @Transactional
    public Red actualizarRed(Red red) {
        return this.redRepo.save(red);
    }
    
}
