package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.dto.UsuarioDTO;
import com.portafolio.portafoliodigital.model.Usuario;
import com.portafolio.portafoliodigital.repository.UsuarioRepository;
import com.portafolio.portafoliodigital.service.IUsuarioService;
import com.portafolio.portafoliodigital.util.Helpers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioServiceImplementacion implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;
    private Helpers help;

    @Override
    public List<UsuarioDTO> listarUsuarios() {

        /*
            Convertimos los usuarios en tipo usuarioDTO mediante el recorrido de la lista y 
            la funcion modelMapper
         */
        List<UsuarioDTO> dto = new ArrayList<>();

        List<Usuario> user = usuarioRepo.findAll();

        for (Usuario usu : user) {
            UsuarioDTO usuarioDto = help.modelMapper().map(usu, UsuarioDTO.class);
            dto.add(usuarioDto);
        }

        return dto;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        this.usuarioRepo.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        this.usuarioRepo.deleteById(id);
    }    

    @Override
    public void actualizarUsuario(Usuario usuario) {                                                
        this.usuarioRepo.save(usuario);
    }

//    @Override
//    public ResponseEntity<Usuario> patch(Long id, Map<Object, Object> fields) {
//        Optional<Usuario> book = usuarioRepo.findById(id);
//        if (book.isPresent()) {
//            fields.forEach((key, value) -> {
//                Field field = ReflectionUtils.findField(Usuario.class, (String) key);
//                field.setAccessible(true);
//                ReflectionUtils.setField(field, book.get(), value);
//            });
//            Usuario updatedBook = usuarioRepo.save(book.get());
//            updatedBook.add(linkTo(methodOn(BookResourceImpl.class).findById(updatedBook.getId())).withSelfRel());
//            updatedBook.add(linkTo(methodon(BookResourceImpl.class).findAll()).withSelfRel());
//            return new ResponseEntity<>(updatedBook, HttpStatus.0OK
//        
//        );
//    }
//    return null;
//    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return this.usuarioRepo.findById(id);
    }

    @Override
    public Usuario actualizarPresentacion(Usuario usuario) {
        return this.usuarioRepo.save(usuario);
    }

}
