package com.bsv.geotracksystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bsv.geotracksystem.entity.User;
import com.bsv.geotracksystem.controller.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
