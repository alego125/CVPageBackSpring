
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Proyecto;
import com.portafolio.portafoliodigital.repository.ProyectoRepository;
import com.portafolio.portafoliodigital.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProyectoServiceImplementacion implements IProyectoService{

    @Autowired
    private ProyectoRepository proyectoRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Proyecto> listarProyectos() {
        return this.proyectoRepo.findAll();
    }

    @Override
    @Transactional
    public Proyecto crearProyecto(Proyecto proyecto) {
        return this.proyectoRepo.save(proyecto);
    }

    @Override
    @Transactional
    public void eliminarProyecto(Long id) {
        this.proyectoRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarProyecto(Proyecto proyecto) {
        this.proyectoRepo.save(proyecto);
    }
    
}
