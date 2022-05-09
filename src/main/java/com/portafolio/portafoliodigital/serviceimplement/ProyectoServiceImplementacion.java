
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Proyecto;
import com.portafolio.portafoliodigital.repository.ProyectoRepository;
import com.portafolio.portafoliodigital.service.IProyectoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoServiceImplementacion implements IProyectoService{

    @Autowired
    private ProyectoRepository proyectoRepo;
    
    @Override
    public List<Proyecto> listarProyectos() {
        return this.proyectoRepo.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyecto) {
        return this.proyectoRepo.save(proyecto);
    }

    @Override
    public Proyecto actualizarProyecto(Proyecto proyecto) {
        return this.proyectoRepo.save(proyecto);
    }

    @Override
    public Optional<Proyecto> buscarProyectoPorId(Long id) {
        return this.proyectoRepo.findById(id);
    }
    
    @Override
    public Optional<Proyecto> eliminarProyecto(Long id) {
        Optional<Proyecto> proyecto = this.proyectoRepo.findById(id);
        this.proyectoRepo.deleteById(id);
        return proyecto;
    }
}
