
package com.tutorial.crud.repository;
import com.tutorial.crud.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedRepository extends JpaRepository<Red, Long> {
    
}
