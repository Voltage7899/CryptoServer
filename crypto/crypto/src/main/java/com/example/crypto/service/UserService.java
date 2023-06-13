package com.example.crypto.service;

import com.example.crypto.entity.UserEntity;
import com.example.crypto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntity user){
        if (isPresent(user)){
            return "Пользователь уже сущестует";
        }else {
            userRepository.save(user);
            return "Создан новый пользователь:" + user.getEmail();
        }
    }

    public boolean isPresent(UserEntity user){
        return userRepository.findById(user.getEmail()).isPresent();
    }

    public UserEntity getUser(int id){
        List<UserEntity> users = userRepository.findAll();
        return users.stream()
                .filter(x -> x.getPhone() == id)
                .findAny()
                .orElse(null);

    }

    public String login(UserEntity user){
        List<UserEntity> users = userRepository.findAll();
        UserEntity inUser = users.stream()
                .filter(x -> x.getEmail().equals(user.getEmail()) && x.getPassword().equals(user.getPassword()))
                .findAny()
                .orElse(null);
        if (inUser != null) return "Вы успешно авторизованы";
        else return "Пользователь с таким логином & паролем не найден";
    }




}
