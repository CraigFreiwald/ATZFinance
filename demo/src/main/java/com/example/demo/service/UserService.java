package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);

}

