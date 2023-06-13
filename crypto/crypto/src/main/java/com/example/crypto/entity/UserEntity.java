package com.example.crypto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Users")
public class UserEntity {
    @Id
    private String email;
    private int phone;
    private String password;
    private boolean trial_period;

    public UserEntity(String email, int phone, String password, boolean trial_period) {
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.trial_period = trial_period;
    }
    //    private String token;

//    public UserEntity(String token) throws NoSuchAlgorithmException {
//        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//        messageDigest.update(String.c email.getBytes() + password.getBytes());
//        this.token = new String(messageDigest.digest());
//    }
}
