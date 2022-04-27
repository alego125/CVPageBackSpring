
package com.portafolio.portafoliodigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Provincia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provincia")
    private Long idProvincia;
    
    @Column(name = "provincia_nombre", length = 45, nullable = false)
    private String nombreProvincia;
    
    @ManyToOne
    @JoinTable(name = "id_pais")
    private Pais pais;

    public Provincia() {
    }

    public Provincia(Long idProvincia, String nombreProvincia, Pais pais) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.pais = pais;
    }
    
    
    
}
