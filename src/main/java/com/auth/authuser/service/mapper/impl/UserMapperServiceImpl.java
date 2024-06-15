package com.auth.authuser.service.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.auth.authuser.model.core.User;
import com.auth.authuser.model.dto.UserDTO;
import com.auth.authuser.service.mapper.UserMapperService;

@Service
public class UserMapperServiceImpl implements UserMapperService {

    private ModelMapper modelMapper = new ModelMapper();

    public UserDTO converterToDto( User user) {
        
        return modelMapper.map(user, UserDTO.class);
    }

    public User converterToEntity(UserDTO userDTO) {
        
        return modelMapper.map(userDTO, User.class);
    }

}
