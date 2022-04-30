
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Usuario;
import com.portafolio.portafoliodigital.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "user")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService serviceUser;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<UsuarioDTO> listarSkill(){
        return serviceUser.listarUsuarios();
    }
    
    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
    public void crearUsuario(Usuario usuario){
        this.serviceUser.actualizarUsuario(usuario);
    }
    
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void actualizarUsuario(@RequestBody Usuario usuario){
        this.serviceUser.actualizarUsuario(usuario);
    }
        
}
