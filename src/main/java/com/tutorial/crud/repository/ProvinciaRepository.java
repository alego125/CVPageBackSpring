
package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


 @Service
public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {
    
}
