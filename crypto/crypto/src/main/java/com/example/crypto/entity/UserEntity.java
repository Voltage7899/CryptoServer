package com.example.crypto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class UserEntity {
    @Id
    private String email;
    private int phone;
    private String password;
    private boolean trial_period;
}
