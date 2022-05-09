
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Proyecto;
import com.portafolio.portafoliodigital.model.Usuario;
import com.portafolio.portafoliodigital.service.IProyectoService;
import com.portafolio.portafoliodigital.util.Helpers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "proyecto")
@RestController
public class ProyectoController {
    
    @Autowired
    private IProyectoService serviceProyect;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Proyecto> listarProyectos(){
        return this.serviceProyect.listarProyectos();
    }
    
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
//        UsuarioDTO userDto = Helpers.modelMapper().map(proyecto.getUsuario(), UsuarioDTO.class);
//        Usuario user = Helpers.modelMapper().map(userDto, Usuario.class);
//        Long userId = proyecto.
//        proyecto.setUsuario(user);
//        System.out.println(proyecto);        
        return ResponseEntity.ok(this.serviceProyect.crearProyecto(proyecto));
    }
    
    @DeleteMapping(value = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Proyecto>> deleteProject(@PathVariable Long id){
        Optional<Proyecto> proyecto = this.serviceProyect.buscarProyectoPorId(id);
        this.serviceProyect.eliminarProyecto(id);
        return ResponseEntity.ok(proyecto);
    }
    
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Proyecto> updateProyecto(@RequestBody Proyecto proyecto){
        return ResponseEntity.ok(this.serviceProyect.actualizarProyecto(proyecto));
    }
    
}
