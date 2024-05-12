package com.auth.authuser.repository.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.authuser.model.generic.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>  {
    
}
