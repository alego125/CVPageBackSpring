
package com.tutorial.crud.entity;

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
public class Institucion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_institucion")
    private Long idInstitucion;
    
    @Column(name = "nombre_institucion",length = 45, nullable = false)
    private String nombreInstitucion;
    
//    @ManyToOne
//    @JoinColumn(name = "id_ciudad")
//    private Ciudad ciudad;

    public Institucion() {
    }

    public Institucion(Long idInstitucion, String nombreInstitucion, Ciudad ciudad) {
        this.idInstitucion = idInstitucion;
        this.nombreInstitucion = nombreInstitucion;
    }
    
    
    
}
