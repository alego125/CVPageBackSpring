
package com.tutorial.crud.service;


import com.tutorial.crud.dto.UsuarioDTO;
import com.tutorial.crud.entity.User;

import java.util.List;
import java.util.Optional;


public interface IUsuarioService {
    
    List<UsuarioDTO> listarUsuarios();
    UsuarioDTO listarUsuarioPorUserName(String userName);
    void crearUsuario(User user);
    void eliminarUsuario(Long id);
    User actualizarPresentacion(User user);
    void actualizarUsuario(User user);
    Optional<User> buscarPorId(Long id);
//    public ResponseEntity<Usuario> patch(Long id, Map<Object, Object> fields);
    
}
