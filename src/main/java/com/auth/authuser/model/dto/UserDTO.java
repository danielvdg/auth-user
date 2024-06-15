package com.auth.authuser.model.dto;

import java.util.Set;

import com.auth.authuser.model.core.enumTypes.RoleEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    
    private String username;
    private String password;
    private Set<RoleEnum> roles;
    
}