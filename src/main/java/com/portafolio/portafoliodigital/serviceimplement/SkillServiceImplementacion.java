
package com.portafolio.portafoliodigital.serviceimplement;

import com.portafolio.portafoliodigital.model.Skill;
import com.portafolio.portafoliodigital.repository.SkillRepository;
import com.portafolio.portafoliodigital.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SkillServiceImplementacion implements ISkillService{

    @Autowired
    private SkillRepository skillRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Skill> listarSkills() {
        return this.skillRepo.findAll();
    }

    @Override
    @Transactional
    public void crearSkill(Skill skill) {
        this.skillRepo.save(skill);
    }

    @Override
    @Transactional
    public void eliminarSkill(Long id) {
        this.skillRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void actualizarSkill(Skill skill) {
        this.skillRepo.save(skill);
    }
    
}
