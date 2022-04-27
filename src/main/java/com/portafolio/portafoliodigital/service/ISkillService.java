
package com.portafolio.portafoliodigital.service;

import com.portafolio.portafoliodigital.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> listarSkills();
    public void crearSkill(Skill skill);
    public void eliminarSkill(Long id);
    public void actualizarSkill(Skill skill);
    
}
