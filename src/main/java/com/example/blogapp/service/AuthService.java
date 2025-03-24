package com.example.blogapp.service;

import com.example.blogapp.configuration.CustomUserDetailsService;
import com.example.blogapp.configuration.JwtUtils;
import com.example.blogapp.dto.Role;
import com.example.blogapp.entity.Users;
import com.example.blogapp.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthService {

    private final UserRepo userRepository;
    private final PasswordEncoder passwordEncoder;
    private CustomUserDetailsService customUserDetailsService;
    private final JwtUtils jwtUtils;

    public String register(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if(user.getRole() == null){
            user.setRole(Role.USER);
        }
        userRepository.save(user);
        return "User registered successfully!";
    }

    public String login(String username, String password) {
        Optional<Users> user = userRepository.findByEmail(username);
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            UserDetails userDetails = customUserDetailsService.loadUserByUsername(user.get().getEmail());
            return jwtUtils.generateToken(userDetails);
        }
        throw new RuntimeException("Invalid username or password");
    }
}
