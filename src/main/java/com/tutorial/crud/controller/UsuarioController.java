
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.dto.UsuarioDTO;
import com.tutorial.crud.entity.Domicilio;
import com.tutorial.crud.entity.User;
import com.tutorial.crud.service.IDomicilioService;
import com.tutorial.crud.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
@CrossOrigin(origins = "*")
public class UsuarioController {
    
    @Autowired
    IUsuarioService serviceUser;

    @Autowired
    IDomicilioService serviceDomicilio;

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<UsuarioDTO> listarSkill(){
        return serviceUser.listarUsuarios();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "updateUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarUsuario(@PathVariable Long id, @RequestBody UsuarioDTO userDto){
        
        User user = this.serviceUser.buscarPorId(id).orElse(null);

        user.setApellido(userDto.getApellido());
        user.setNombre(userDto.getNombre());
        user.setEmail(userDto.getEmail());
        user.setFechaNacimiento(userDto.getFechaNacimiento());
        user.setTelefono(userDto.getTelefono());
        user.setUrlPerfil(userDto.getUrlPerfil());
        user.setUrlPortada(userDto.getUrlPortada());
        user.setWeb(userDto.getWeb());

        if(user.getDomicilio() != null){
            user.getDomicilio().setCalle(userDto.getDomicilio().getCalle());
            user.getDomicilio().setDepartamento(userDto.getDomicilio().getDepartamento());
            user.getDomicilio().setNumero(userDto.getDomicilio().getNumero());
            user.getDomicilio().setPiso(userDto.getDomicilio().getPiso());
            user.getDomicilio().setCiudad(userDto.getDomicilio().getCiudad());
        }else{
            //Para el caso de que no tenga un domicilio creado el usuario entonces le crea uno pero sin
            //el id ya que este se crea automaticamente. Luego se pasa el usuario al metodo crearDomicilio
            //para asignarlo a la base de datos y este metodo nos devuelve el JSON con el domicilio creado
            //el cual seteamos en el objeto de user el cual se asigna en la base de datos
            Domicilio domicilioNuevo = new Domicilio(userDto.getDomicilio().getCalle(),
                    userDto.getDomicilio().getNumero(), userDto.getDomicilio().getPiso(),
                    userDto.getDomicilio().getDepartamento(), userDto.getDomicilio().getCiudad());
            user.setDomicilio(serviceDomicilio.crearDomicilio(domicilioNuevo));
        }

        this.serviceUser.actualizarUsuario(user);


    }
    
    @GetMapping("/buscar/{id}")
    public Optional<User> buscarPorId(@PathVariable Long id){
        return this.serviceUser.buscarPorId(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "updatePresentacion/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> actualizarCrearPresentacion(@PathVariable Long id, @RequestBody String presentacion){
        //Obtengo el usuario con el id y lo guardo en variable
        User user = this.serviceUser.buscarPorId(id).orElse(null);
        //Seteo el nuevo parametro obtenido de la request en usuario
        user.setPresentacion(presentacion);
        //Retorno la respuesta y guardo la informacion del nuevo usuario con el parametro de presentacion nuevo o actualizado
        return ResponseEntity.ok(this.serviceUser.actualizarPresentacion(user));
    }

    @GetMapping(value = "buscarPorUserName/{userName}")
    public ResponseEntity<UsuarioDTO> getUserByUserName(@PathVariable("userName") String userName){
        return ResponseEntity.ok(this.serviceUser.listarUsuarioPorUserName(userName));
    }

}
