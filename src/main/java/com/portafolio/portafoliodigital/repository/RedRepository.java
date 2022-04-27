
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedRepository extends JpaRepository<Red, Long>{
    
}
