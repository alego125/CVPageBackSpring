
package com.tutorial.crud.service;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.NombreRedes;
import com.tutorial.crud.repository.NombreRedesRepository;
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
