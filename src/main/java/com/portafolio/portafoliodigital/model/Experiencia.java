
package com.portafolio.portafoliodigital.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
    @Column(name = "descripcion_areas", length = 45, nullable = false)
    private String  descripcionTareas;
    
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;
    
    @Column(name = "fecha_fin", nullable = true)
   private Date fechaFin;

    public Experiencia() {
    }

    public Experiencia(Long idExperiencia, String nombreEmpresa, String descripcionTareas, Date fechaInicio, Date fechaFin) {
        this.idExperiencia = idExperiencia;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionTareas = descripcionTareas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    
    
}
