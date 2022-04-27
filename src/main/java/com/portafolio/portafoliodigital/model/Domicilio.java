
package com.portafolio.portafoliodigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
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
    
    @OneToOne
    @JoinColumn(name = "id_domicilio")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;

    public Domicilio() {
    }

    public Domicilio(Long idDomicilio, String calle, String numero, String piso, String departamento, Usuario usuario, Ciudad ciudad) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.usuario = usuario;
        this.ciudad = ciudad;
    }      
    
}
