
package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tutorial.crud.security.entity.Usuario;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
public class Domicilio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_domicilio")
    private Long idDomicilio;
    
    @Column(length = 45, nullable = false)
    private String calle;
    
    @Column(length = 45, nullable = false)
    private String numero;
    
    @Column(length = 45, nullable = true)
    private String piso;
    
    @Column(length = 45, nullable = true)
    private String departamento;
    
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;

    public Domicilio() {
    }

    public Domicilio(String calle, String numero, String piso, String departamento, Ciudad ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    public Domicilio(Long idDomicilio, String calle, String numero, String piso, String departamento, Usuario usuario, Ciudad ciudad) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }      
    
}
