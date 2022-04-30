
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRespository extends JpaRepository<Pais, Long>{
    
}
