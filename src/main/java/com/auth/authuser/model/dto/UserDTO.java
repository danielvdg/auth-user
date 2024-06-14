package com.auth.authuser.model.dto;

import java.util.Set;

import com.auth.authuser.model.core.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    
    private Long id;   
    private String username;
    private String password;
    private Set<Role> roles;
    
}