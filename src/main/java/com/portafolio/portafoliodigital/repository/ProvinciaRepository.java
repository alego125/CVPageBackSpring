
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


 @Service
public interface ProvinciaRepository extends JpaRepository<Provincia, Long>{
    
}
