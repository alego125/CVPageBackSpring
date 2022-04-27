
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
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_skill")
    private Long idSkill;
    
    @Column(name = "nombre_skill", length = 45, nullable = false)
    private String nombreSkill;
    
    @Column(length = 3, nullable = false)
    private float porcentaje;

    public Skill() {
    }

    public Skill(Long idSkill, String nombreSkill, float porcentaje) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
    }
    
    
    
}
