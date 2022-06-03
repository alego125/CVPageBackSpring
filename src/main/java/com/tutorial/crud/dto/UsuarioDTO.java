
package com.tutorial.crud.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.tutorial.crud.entity.Domicilio;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    Long id;   
    String name;
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    String web;
    String telefono;
    String email;    
    String presentacion;
    String urlPortada;
    String urlPerfil;
    Boolean active;
    String rol;
    Domicilio domicilio;

}
