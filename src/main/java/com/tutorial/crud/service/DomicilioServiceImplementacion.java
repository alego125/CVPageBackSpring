
package com.tutorial.crud.service;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Domicilio;
import com.tutorial.crud.repository.DomicilioRepository;
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
    public Domicilio crearDomicilio(Domicilio domicilio) {
        return this.domicilioRepo.save(domicilio);
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
