package com.auth.authuser.service;

import java.util.List;
import java.util.Optional;

import com.auth.authuser.model.core.User;

public interface UserService  {

    User create(User user);

    Optional<User> findById(Long id);

    List<User> findAll();

    User update(Long id, User userDetails);

    void delete(Long id); 
}
