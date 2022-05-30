
package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class NombreRedes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nombreRedes")
    private Long idNombreRedes;
    
    @Column(name = "nombre_red", length = 45, nullable = false)
    private String nombreRed;

    public NombreRedes() {
    }

    public NombreRedes(Long idNombreRedes, String nombreRed) {
        this.idNombreRedes = idNombreRedes;
        this.nombreRed = nombreRed;
    }
    
    
    
    
}
