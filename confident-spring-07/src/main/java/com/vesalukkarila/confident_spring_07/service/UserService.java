package com.vesalukkarila.confident_spring_07.service;

import com.vesalukkarila.confident_spring_07.model.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserService {
    //atm faking to always to find a user from database
    public User findById(String id){
        String randomName = UUID.randomUUID().toString();
        return new User(id, randomName);
    }
}
