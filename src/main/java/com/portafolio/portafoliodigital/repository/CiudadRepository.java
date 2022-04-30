
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.Ciudad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long>{
    @Query(nativeQuery = true,  value = "SELECT * FROM ciudad WHERE id_provincia = :id")
    List<Ciudad> obtenerCiudadPorProvincia(@Param("id") Long id);
}
