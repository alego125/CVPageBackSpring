
package com.portafolio.portafoliodigital.repository;

import com.portafolio.portafoliodigital.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
    
}
