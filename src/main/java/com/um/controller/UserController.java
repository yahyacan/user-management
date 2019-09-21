package com.um.controller;

import com.um.domain.User;
import com.um.exception.UserNotFoundException;
import com.um.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin("http://localhost:8081")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> optionalUser = userService.findById(id);
        return optionalUser
                .map(user -> user)
                .orElseThrow(new UserNotFoundException());
    }
}
