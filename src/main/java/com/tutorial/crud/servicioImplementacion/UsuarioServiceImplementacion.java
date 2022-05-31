package com.tutorial.crud.servicioImplementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tutorial.crud.dto.UsuarioDTO;
import com.tutorial.crud.entity.User;
import com.tutorial.crud.repository.UserRepository;
import com.tutorial.crud.service.IUsuarioService;
import com.tutorial.crud.util.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioServiceImplementacion implements IUsuarioService {

    @Autowired
    private UserRepository usuarioRepo;

    @Override
    public List<UsuarioDTO> listarUsuarios() {

        /*
            Convertimos los usuarios en tipo usuarioDTO mediante el recorrido de la lista y 
            la funcion modelMapper
         */
        List<UsuarioDTO> dto = new ArrayList<>();

        List<User> user = usuarioRepo.findAll();

        for (User usu : user) {
            UsuarioDTO usuarioDto = Helpers.modelMapper().map(usu,UsuarioDTO.class);
            dto.add(usuarioDto);
        }

        return dto;
    }

    @Override
    public UsuarioDTO listarUsuarioPorUserName(String userName) {

        Optional<User> user = usuarioRepo.findByName(userName);
        UsuarioDTO usuarioDto = Helpers.modelMapper().map(user,UsuarioDTO.class);

        return usuarioDto;
    }


    @Override
    public void crearUsuario(User user) {
        this.usuarioRepo.save(user);
    }

    @Override
    public void eliminarUsuario(Long id) {
        this.usuarioRepo.deleteById(id);
    }    

    @Override
    public void actualizarUsuario(User user) {
        this.usuarioRepo.save(user);
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
    public Optional<User> buscarPorId(Long id) {
        return this.usuarioRepo.findById(id);
    }

    @Override
    public User actualizarPresentacion(User user) {
        return this.usuarioRepo.save(user);
    }

}
