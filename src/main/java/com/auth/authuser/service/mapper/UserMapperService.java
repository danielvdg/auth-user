package com.auth.authuser.service.mapper;

import com.auth.authuser.model.core.User;
import com.auth.authuser.model.dto.UserDTO;

public interface UserMapperService {

    public UserDTO converterToDto( User user);

    public User converterToEntity(UserDTO userDTO);
    
}
