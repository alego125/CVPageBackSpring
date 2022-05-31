
package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.tutorial.crud.security.entity.Usuario;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Red {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_red")
    private Long idRed;
    
    @Column(length = 255, nullable = false)
    private String link;
    
    @ManyToOne
    @JoinColumn(name="id_nombreRedes")
    private NombreRedes nombreRed;
    
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User usuario;

    public Red() {
    }

    public Red(Long idRed, String link, NombreRedes nombreRed, Long idUser) {
        this.idRed = idRed;
        this.link = link;
        this.nombreRed = nombreRed;
    }

        
    
}
