
package com.portafolio.portafoliodigital.model;

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
public class Ciudad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Long idCiudad;
    
    @Column(name = "ciudad_nombre", length = 45, nullable = false)
   private String nombreCiudad;
    
    @Column(name = "codigo_postal", length = 45, nullable = false)
    private String  codigoPostal;
    
    @ManyToOne
    @JoinColumn(name = "id_provincia")
    private Provincia provincia;

    public Ciudad() {
    }

    public Ciudad(Long idCiudad, String nombreCiudad, String codigoPostal, Provincia provincia) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
    }        
    
}
