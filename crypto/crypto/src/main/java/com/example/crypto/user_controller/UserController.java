package com.example.crypto.user_controller;

import com.example.crypto.entity.UserEntity;
import com.example.crypto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity getUser() {

        try {
            return ResponseEntity.ok("Сервер работает");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserEntity user) {
        return userService.login(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable int id) {
        if (userService.getUser(id) != null){
            return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // сюда можно кастомную ошибку
        }

    }
}
