
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Skill;
import com.portafolio.portafoliodigital.service.ISkillService;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "skill")
@RestController
public class SkillController {
    
    @Autowired
    private ISkillService serviceSkill;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Skill> listarSkill(){
        return serviceSkill.listarSkills();
    }
    
}
