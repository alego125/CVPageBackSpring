
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Usuario;
import com.portafolio.portafoliodigital.repository.UsuarioRepository;
import com.portafolio.portafoliodigital.service.IUsuarioService;
import com.portafolio.portafoliodigital.util.Helpers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UsuarioServiceImplementacion implements  IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepo;
    private Helpers help;

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioDTO> listarUsuarios() {
        
        /*
            Convertimos los usuarios en tipo usuarioDTO mediante el recorrido de la lista y 
            la funcion modelMapper
        */
        
        List<UsuarioDTO> dto = new ArrayList<>();
        
        List<Usuario> user = usuarioRepo.findAll();
        
        for(Usuario usu : user){            
            UsuarioDTO  usuarioDto = help.modelMapper().map(usu, UsuarioDTO.class);            
            dto.add(usuarioDto);            
        }
        
        return dto;
    }

    @Override
    @Transactional
    public void crearUsuario(Usuario usuario) {
        this.usuarioRepo.save(usuario);
    }

    @Override
    @Transactional
    public void eliminarUsuario(Long id) {
        this.usuarioRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarUsuario(Usuario usuario) {
        this.usuarioRepo.save(usuario);
    }
    
    
    
    
}
