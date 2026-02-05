package com.auth.auth.service;

import org.springframework.stereotype.Service;
import com.auth.auth.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.auth.auth.model.User;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder;

    public UserService(UserRepository userRepository,
                          BCryptPasswordEncoder encoder) {
          this.userRepository = userRepository;
          this.encoder = encoder;
                          }

    public void register(String username, String password) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(encoder.encode(password));

        userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Invalid Credentials!"));

        if (!encoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid Credentials!");
        }

        return user;
    }

}
