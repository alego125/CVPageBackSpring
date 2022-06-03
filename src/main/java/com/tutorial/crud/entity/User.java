package com.tutorial.crud.entity;

import java.io.Serializable;
import java.time.LocalDate;
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
import lombok.ToString;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "rol", nullable = false)
    private String rolUser;
    
    @Column(name = "user_name", length = 45, nullable = false)
    private String name;

    @Column(length = 45, nullable = false)
    private String nombre;
    
    @Column(length = 45, nullable = false)
    private String apellido;
    
    @Column(name = "fecha_nacimiento", length = 3, nullable = true)
    private LocalDate fechaNacimiento;
    
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

    public User() {
    }

    public User(Boolean active, String rolUser, String name, String nombre, String apellido, String email) {
        this.active = active;
        this.rolUser = rolUser;
        this.name = name;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public User(Long idUser, String name, String nombre, String apellido, LocalDate fechaNacimiento, String web, String telefono, String email, String presentacion, String urlPortada, String urlPerfil) {
        this.idUser = idUser;
        this.name = name;
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
