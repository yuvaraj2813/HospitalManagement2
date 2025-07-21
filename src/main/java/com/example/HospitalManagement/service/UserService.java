package com.example.HospitalManagement.service;

import com.example.HospitalManagement.Entity.User;
import com.example.HospitalManagement.Repository.UserRepository;
import com.example.HospitalManagement.dto.LoginRequest;
import com.example.HospitalManagement.dto.UserRequest;
import com.example.HospitalManagement.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    private UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }


    public void registerUser(UserRequest req) {
        if (userRepository.existsByEmail(req.getEmail())) {
            throw new RuntimeException("Email already Exists");
        }
        User user = new User();
        user.setUserName(req.getUserName());
        user.setEmail(req.getEmail());
        user.setPassword(passwordEncoder.encode(req.getPassword()));
        user.setRole(req.getRole());
        userRepository.save(user);
    }

    public String loginUser(LoginRequest req) {
        return userRepository.findByEmail(req.getEmail())
                .filter(user -> passwordEncoder.matches(req.getPassword(), user.getPassword()))
                .map(user -> jwtUtil.generateToken(user.getUserName(), user.getRole()))
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));
    }
}
