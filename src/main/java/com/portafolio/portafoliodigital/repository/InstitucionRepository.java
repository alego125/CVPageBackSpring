
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.Institucion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitucionRepository extends JpaRepository<Institucion, Long>{    
}
