package com.portafolio.portafoliodigital.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter @Setter
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    
    @Column(name = "user_name", length = 45, nullable = false)
    private String name;
    
    @Column(length = 180, nullable = false)
    private String password;    
    
    @Column(length = 45, nullable = false)
    private String nombre;
    
    @Column(length = 45, nullable = false)
    private String apellido;
    
    @Column(name = "fecha_nacimiento", length = 3, nullable = false)
    private Date fechaNacimiento;
    
    @Column(length = 45, nullable = true)
    private String web;
    
    @Column(length = 25, nullable = true)
    private String telefono;
    
    @Column(length = 45, nullable = false)
    private String email;    
    
    @Column(length = 450, nullable = true)
    private String presentacion;
    
     @Column(length = 450, nullable = true)
    private String urlPortada;
     
    @Column(length = 450, nullable = true)
    private String urlPerfil;
      
    @OneToOne
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;

    public Usuario() {
    }

    public Usuario(Long idUser, String name, String password, String nombre, String apellido, Date fechaNacimiento, String web, String telefono, String email, String presentacion, String urlPortada, String urlPerfil) {
        this.idUser = idUser;
        this.name = name;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.web = web;
        this.telefono = telefono;
        this.email = email;
        this.presentacion = presentacion;
        this.urlPortada = urlPortada;
        this.urlPerfil = urlPerfil;
    }

    
    
    
    
    
}
