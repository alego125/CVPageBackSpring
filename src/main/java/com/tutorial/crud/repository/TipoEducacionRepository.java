
package com.tutorial.crud.repository;

import com.tutorial.crud.entity.TipoEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEducacionRepository extends JpaRepository<TipoEducacion, Long> {
}
