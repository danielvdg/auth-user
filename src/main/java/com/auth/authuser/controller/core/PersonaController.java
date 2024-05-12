package com.auth.authuser.controller.core;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.authuser.model.generic.Persona;
import com.auth.authuser.repository.core.PersonaRepository;


@RestController
@RequestMapping("/persona")
public class PersonaController {
    
    private PersonaRepository personaRepository;

 
    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @GetMapping
    public List<Persona> all() {
        
        return personaRepository.findAll();
    }

    @PostMapping
    @ResponseBody 
    public ResponseEntity<Persona> create( @RequestBody Persona persona) {

        persona.setName(persona.getName());
        persona.setCpf(persona.getCpf());
        persona.setEmail(persona.getEmail());

        return  ResponseEntity.ok(this.personaRepository.save(persona));
    }

    
}
