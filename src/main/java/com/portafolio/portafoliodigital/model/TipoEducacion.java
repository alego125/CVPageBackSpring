
package com.portafolio.portafoliodigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipo_educacion")
@Getter @Setter
public class TipoEducacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipo;
    
    @Column(name = "nombre_tipo", length = 45, nullable = false)
    private String nombreTipo;

    public TipoEducacion() {
    }

    public TipoEducacion(Long idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }
    
    
    
}
