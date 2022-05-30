
package com.tutorial.crud.service;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Ciudad;
import com.tutorial.crud.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CiudadServiceImplementacion implements ICiudadService{

    @Autowired
    private CiudadRepository ciudadRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> listarCiudad() {
        return this.ciudadRepo.findAll();
    }

    @Override
    public void crearCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCiudad(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ciudad> buscarPorProvincia(Long id) {
        return this.ciudadRepo.obtenerCiudadPorProvincia(id);
    }

    @Override
    public Optional<Ciudad> listarCiudadPorId(Long id) {
        return this.ciudadRepo.findById(id);
    }
    
}
