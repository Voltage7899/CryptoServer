package com.example.crypto.user_controller;

import com.example.crypto.entity.UserEntity;
import com.example.crypto.repository.UserRepository;
import com.example.crypto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity getUser(){

        try{
            return ResponseEntity.ok("Сервер работает");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PostMapping("/addUser")
    public void addUser(@RequestBody UserEntity user){
        userService.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody UserEntity user){
        return userService.login(user);

    }
}
