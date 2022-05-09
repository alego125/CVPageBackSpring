
package com.portafolio.portafoliodigital.controller;

import com.portafolio.portafoliodigital.model.Skill;
import com.portafolio.portafoliodigital.service.ISkillService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Skill> crearSkill(@RequestBody Skill skill){
        return ResponseEntity.ok(this.serviceSkill.crearSkill(skill));
    }
    
    @DeleteMapping(value = "delete/{id}")
    public void eliminarSkill(@PathVariable Long id){
        try {
            this.serviceSkill.eliminarSkill(id);            
        } catch (Exception e) {
            throw (e);
        }
    }
    
    @GetMapping(value = "searchById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Skill>> buscarSkillPorId(@PathVariable Long id){
        return ResponseEntity.ok(this.serviceSkill.buscarSkillPorId(id));
    }
    
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Skill> actualizarSkill(@RequestBody Skill skill){
        return ResponseEntity.ok(this.serviceSkill.crearSkill(skill));
    }
    
}
