 
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private Long idProyecto;
    
    @Column(name = "titulo_proyecto", length = 45, nullable = false)
    private String tituloProyecto;
    
    @Column(length = 450, nullable = false)
    private String descripcion;
    
    @Column(name = "fecha_inicio",  nullable = false)
   private Date fechaInicio;
    
    @Column(name = "fecha_fin", nullable = true)
   private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;

    public Proyecto() {
    }

    public Proyecto(Long idProyecto, String tituloProyecto, String descripcion, Date fechaInicio, Date fechaFin) {
        this.idProyecto = idProyecto;
        this.tituloProyecto = tituloProyecto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    
    
}
