package com.techutube.userregistration.service;

import com.techutube.userregistration.dto.SignUpRequest;
import com.techutube.userregistration.entity.User;
import com.techutube.userregistration.enums.Role;
import com.techutube.userregistration.repository.UserRepository;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl {

    private final UserRepository userRepository;

    public User signUp(SignUpRequest signUpRequest) {
        User user =  new User();
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(signUpRequest.getPassword());
        user.setRole(Role.USER);
        return userRepository.save(user);
    }

}
