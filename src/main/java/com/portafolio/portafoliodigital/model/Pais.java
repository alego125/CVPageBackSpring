
package com.portafolio.portafoliodigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pais {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private Long idPais;
    
    @Column(name = "pis_nombre", length = 45, nullable = false)
    private String nombrePais;

    public Pais() {
    }

    public Pais(Long idPais, String nombrePais) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
    }
        
    
    
}
