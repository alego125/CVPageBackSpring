
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.NombreRedes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NombreRedesRepository extends JpaRepository<NombreRedes, Long>{
    
}
