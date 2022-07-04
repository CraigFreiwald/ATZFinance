package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);

}

