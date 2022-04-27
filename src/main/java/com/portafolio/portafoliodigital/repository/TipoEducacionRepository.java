
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.TipoEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEducacionRepository extends JpaRepository<TipoEducacion, Long>{    
}
