
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<UsuarioDTO> listarUsuarios();
    public void crearUsuario(Usuario usuario);
    public void eliminarUsuario(Long id);
    public void actualizarUsuario(Usuario usuario);
    
}
