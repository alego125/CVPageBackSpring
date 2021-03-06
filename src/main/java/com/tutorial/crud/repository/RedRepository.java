
package com.tutorial.crud.repository;
import com.tutorial.crud.entity.Red;
import com.tutorial.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RedRepository extends JpaRepository<Red, Long> {
    Optional<List<Red>> findByIdUser(Long id);
}
