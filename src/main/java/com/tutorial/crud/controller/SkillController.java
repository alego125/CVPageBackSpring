
package com.tutorial.crud.controller;

import java.util.List;
import java.util.Optional;

import com.tutorial.crud.entity.Skill;
import com.tutorial.crud.service.ISkillService;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "skill")
@CrossOrigin(origins = "*")
public class SkillController {
    
    @Autowired
    private ISkillService serviceSkill;
    
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Skill> listarSkill(){
        return serviceSkill.listarSkills();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Skill> crearSkill(@RequestBody Skill skill){
        return ResponseEntity.ok(this.serviceSkill.crearSkill(skill));
    }

    @PreAuthorize("hasRole('ADMIN')")
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

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Skill> actualizarSkill(@RequestBody Skill skill){
        return ResponseEntity.ok(this.serviceSkill.crearSkill(skill));
    }
    
}
