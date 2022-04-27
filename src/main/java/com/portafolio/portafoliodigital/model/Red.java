
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
public class Red {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_red")
    private Long idRed;
    
    @Column(length = 45, nullable = false)
    private String link;
    
    @Column(length = 45, nullable = false)
    private String nombreRed;

    public Red() {
    }

    public Red(Long idRed, String link, String nombreRed) {
        this.idRed = idRed;
        this.link = link;
        this.nombreRed = nombreRed;
    }        
    
}
