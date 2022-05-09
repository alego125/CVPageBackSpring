
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Usuario;
import com.portafolio.portafoliodigital.service.IUsuarioService;
import java.util.List;
import com.portafolio.portafoliodigital.util.Helpers;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "user")
@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService serviceUser;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<UsuarioDTO> listarSkill(){
        return serviceUser.listarUsuarios();
    }           
    
    @PatchMapping("/patchUpdate/{id}")
    public ResponseEntity<UsuarioDTO> updateUserPartially(@PathVariable(value = "id") Long userId, 
                                                                                                                 @RequestBody Usuario userDetails 
                                                                                                                 )  {
         
        Usuario user = this.serviceUser.buscarPorId(userId).orElse(null);        
         
        user.setNombre(userDetails.getNombre());
        user.setApellido(userDetails.getApellido());
//        user.setEmail(userDetails.getEmail());
//        user.setFechaNacimiento(userDetails.getFechaNacimiento());
        user.setTelefono(userDetails.getTelefono());
//        user.setUrlPerfil(userDetails.getUrlPerfil());
//        user.setUrlPortada(userDetails.getUrlPortada());
//        user.setWeb(userDetails.getWeb());
//        user.setDomicilio(userDetails.getDomicilio());
        
        final Usuario updatedUser = this.serviceUser.actualizarUsuario(user);
                
        
        UsuarioDTO usuarioDto = Helpers.modelMapper().map(updatedUser, UsuarioDTO.class);
        
        return ResponseEntity.ok(usuarioDto);
   }
    
    @GetMapping("/buscar/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Long id){
        return this.serviceUser.buscarPorId(id);
    }
    
}
