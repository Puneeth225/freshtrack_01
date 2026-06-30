package com.freshtrack.warehouse.service;

import com.freshtrack.warehouse.entity.User;
import com.freshtrack.warehouse.repository.UserRepository;
import com.freshtrack.warehouse.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public String login(String email, String password) {
        User user = userRepository.findByEmail(email).orElseThrow();

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid Password");
        }

        return jwtUtil.generateToken(email);
    }
}
