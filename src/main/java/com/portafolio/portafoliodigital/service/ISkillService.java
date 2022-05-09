
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Skill;
import java.util.List;
import java.util.Optional;


public interface ISkillService {
    
    public List<Skill> listarSkills();
    public Skill crearSkill(Skill skill);
    public void eliminarSkill(Long id);
    public void actualizarSkill(Skill skill);
    public Optional<Skill> buscarSkillPorId(Long id);
    
    
}
