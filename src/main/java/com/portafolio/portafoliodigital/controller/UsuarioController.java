
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Domicilio;
import com.portafolio.portafoliodigital.model.Usuario;
import com.portafolio.portafoliodigital.repository.DomicilioRepository;
import com.portafolio.portafoliodigital.service.IDomicilioService;
import com.portafolio.portafoliodigital.service.IUsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "user")
@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService serviceUser;
    private IDomicilioService serviceDomicilio;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<UsuarioDTO> listarSkill(){
        return serviceUser.listarUsuarios();
    }           
     
    @PutMapping(value = "updateUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarUsuario(@PathVariable Long id, @RequestBody UsuarioDTO userDto){
        
        Usuario usuario = this.serviceUser.buscarPorId(id).orElse(null);        
        
        usuario.setApellido(userDto.getApellido());
        usuario.setNombre(userDto.getNombre());
        usuario.setEmail(userDto.getEmail());
        usuario.setFechaNacimiento(userDto.getFechaNacimiento());
        usuario.setTelefono(userDto.getTelefono());
        usuario.setUrlPerfil(userDto.getUrlPerfil());
        usuario.setUrlPortada(userDto.getUrlPortada());
        usuario.setWeb(userDto.getWeb());        
        
        usuario.getDomicilio().setCalle(userDto.getDomicilio().getCalle());
        usuario.getDomicilio().setDepartamento(userDto.getDomicilio().getDepartamento());
        usuario.getDomicilio().setNumero(userDto.getDomicilio().getNumero());
        usuario.getDomicilio().setPiso(userDto.getDomicilio().getPiso());
        usuario.getDomicilio().setCiudad(userDto.getDomicilio().getCiudad());
        
//        usuario.getDomicilio().getCiudad().setIdCiudad(userDto.getDomicilio().getCiudad().getIdCiudad());
//        usuario.getDomicilio().getCiudad().setNombreCiudad(userDto.getDomicilio().getCiudad().getNombreCiudad());
//        
//        usuario.getDomicilio().getCiudad().getProvincia().setIdProvincia(userDto.getDomicilio().getCiudad().getProvincia().getIdProvincia());
//        usuario.getDomicilio().getCiudad().getProvincia().setNombreProvincia(userDto.getDomicilio().getCiudad().getProvincia().getNombreProvincia());
//        
//        usuario.getDomicilio().getCiudad().getProvincia().getPais().setIdPais(userDto.getDomicilio().getCiudad().getProvincia().getPais().getIdPais());
//        usuario.getDomicilio().getCiudad().getProvincia().getPais().setNombrePais(userDto.getDomicilio().getCiudad().getProvincia().getPais().getNombrePais());
                      
        this.serviceUser.actualizarUsuario(usuario);
        
    }
    
    @GetMapping("/buscar/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Long id){
        return this.serviceUser.buscarPorId(id);
    }
    
    @PutMapping(value = "updatePresentacion/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> actualizarCrearPresentacion(@PathVariable Long id, @RequestBody String presentacion){
        //Obtengo el usuario con el id y lo guardo en variable
        Usuario usuario = this.serviceUser.buscarPorId(id).orElse(null);        
        //Seteo el nuevo parametro obtenido de la request en usuario
        usuario.setPresentacion(presentacion);        
        //Retorno la respuesta y guardo la informacion del nuevo usuario con el parametro de presentacion nuevo o actualizado
        return ResponseEntity.ok(this.serviceUser.actualizarPresentacion(usuario));
    }
    
}
