package com.sipios.keiko.controller;

import com.sipios.keiko.controller.dto.User;
import com.sipios.keiko.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static com.sipios.keiko.controller.dto.UserMapper.fromEntities;
import static com.sipios.keiko.controller.dto.UserMapper.fromEntity;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> findAll() {
        return fromEntities(userRepository.findAll());
    }

    @GetMapping("/{userId}")
    public User findById(@PathVariable UUID userId) {
        return fromEntity(userRepository.findById(userId).orElse(null));
    }
}
