
package com.portafolio.portafoliodigital.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_educacion")
    private Long idEducacion;
    
    @Column(name = "nombre_titulo", length = 45, nullable = false)
    private String nombreTitulo;
    
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechainicio;
    @Column(name = "fecha_fin", nullable = true)
    private Date fechaFin;
    
    @JoinColumn(name = "id_user")
    private Long idUser;
    
    /*Conecto la tabla  educacion con institucion marcando la relacion muchos a uno y haciendo el join con el id de institucion el cual sera la clave foranea
    de esta entidad luego declaro un atributo de  clase institucion */
    @ManyToOne
    @JoinColumn(name = "id_institucion")
    private Institucion institucion;

    public Educacion() {
    }

    public Educacion(Long idEducacion, String nombreTitulo, Date fechainicio, Date fechaFin, Institucion institucion) {
        this.idEducacion = idEducacion;
        this.nombreTitulo = nombreTitulo;
        this.fechainicio = fechainicio;
        this.fechaFin = fechaFin;
        this.institucion = institucion;
    }        
    
}
