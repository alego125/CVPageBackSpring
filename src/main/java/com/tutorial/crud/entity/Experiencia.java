
package com.tutorial.crud.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tutorial.crud.security.entity.Usuario;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_experiencia")
    private Long idExperiencia;
    
    @Column(name = "nombre_empresa", length = 45, nullable = false)
    private String nombreEmpresa;
    
    @Column(name = "descripcion_tareas", length = 255, nullable = false)
    private String  descripcionTareas;
    
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;
    
    @Column(name = "fecha_fin", nullable = true)
   private Date fechaFin;
    

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;
    @Column(name = "url_imagen", nullable = true)
   private String urlImagen;

    public Experiencia() {
    }

    public Experiencia(Long idExperiencia, String nombreEmpresa, String descripcionTareas, Date fechaInicio, Date fechaFin, Long idUser, String urlImagen) {
        this.idExperiencia = idExperiencia;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionTareas = descripcionTareas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlImagen = urlImagen;
    }

   
    
    
    
}
