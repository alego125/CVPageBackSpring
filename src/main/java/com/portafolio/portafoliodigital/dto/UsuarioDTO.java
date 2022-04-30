
package com.portafolio.portafoliodigital.dto;

import com.portafolio.portafoliodigital.model.Domicilio;
import java.io.Serializable;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    Long id;   
    String name;
    String nombre;
    String apellido;
    Date fechaNacimiento;
    String web;
    String telefono;
    String email;    
    String presentacion;
    String urlPortada;
    String urlPerfil;
    Domicilio domicilio;
    
    
    
}
