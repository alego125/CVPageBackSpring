
package com.tutorial.crud.service;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Skill;
import com.tutorial.crud.repository.SkillRepository;
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
    public Skill crearSkill(Skill skill) {
        return this.skillRepo.save(skill);
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

    @Override
    public Optional<Skill> buscarSkillPorId(Long id) {
        return this.skillRepo.findById(id);
    }
    
    
    
}
