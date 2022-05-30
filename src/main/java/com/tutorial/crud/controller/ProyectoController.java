
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Proyecto;
import com.tutorial.crud.service.IProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "proyecto")
@CrossOrigin(origins = "*")
public class ProyectoController {
    
    @Autowired
    private IProyectoService serviceProyect;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Proyecto> listarProyectos(){
        return this.serviceProyect.listarProyectos();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
//        UsuarioDTO userDto = Helpers.modelMapper().map(proyecto.getUsuario(), UsuarioDTO.class);
//        Usuario user = Helpers.modelMapper().map(userDto, Usuario.class);
//        Long userId = proyecto.
//        proyecto.setUsuario(user);
//        System.out.println(proyecto);        
        return ResponseEntity.ok(this.serviceProyect.crearProyecto(proyecto));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(value = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Proyecto>> deleteProject(@PathVariable Long id){
        Optional<Proyecto> proyecto = this.serviceProyect.buscarProyectoPorId(id);
        this.serviceProyect.eliminarProyecto(id);
        return ResponseEntity.ok(proyecto);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Proyecto> updateProyecto(@RequestBody Proyecto proyecto){
        return ResponseEntity.ok(this.serviceProyect.actualizarProyecto(proyecto));
    }
    
}
