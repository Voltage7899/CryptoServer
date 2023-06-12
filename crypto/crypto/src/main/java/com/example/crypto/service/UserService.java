package com.example.crypto.service;

import com.example.crypto.entity.UserEntity;
import com.example.crypto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void register(UserEntity user){
        userRepository.save(user);
    }

    public String login(UserEntity user){

        Optional<UserEntity> userFromDB =userRepository.findById(user.getEmail());
        if( userFromDB.isPresent()){
            return userFromDB.get().getEmail();
        }
        return null;
    }
}
