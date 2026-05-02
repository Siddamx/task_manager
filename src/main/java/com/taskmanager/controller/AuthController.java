
package com.taskmanager.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.taskmanager.repository.UserRepository;
import com.taskmanager.model.User;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserRepository repo;

    @PostMapping("/signup")
    public User signup(@RequestBody User u) { return repo.save(u); }

    @PostMapping("/login")
    public User login(@RequestBody User u) {
        return repo.findAll().stream()
            .filter(x -> x.getUsername().equals(u.getUsername()) && x.getPassword().equals(u.getPassword()))
            .findFirst().orElseThrow();
    }
}
