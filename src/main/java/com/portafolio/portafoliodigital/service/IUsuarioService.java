
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Usuario;
import java.util.List;
import java.util.Optional;


public interface IUsuarioService {
    
    public List<UsuarioDTO> listarUsuarios();
    public void crearUsuario(Usuario usuario);
    public void eliminarUsuario(Long id);
    public Usuario actualizarUsuario(Usuario usuario);
    public Optional<Usuario> buscarPorId(Long id);
//    public ResponseEntity<Usuario> patch(Long id, Map<Object, Object> fields);
    
}
