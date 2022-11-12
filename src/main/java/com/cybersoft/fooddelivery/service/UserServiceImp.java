package com.cybersoft.fooddelivery.service;

import com.cybersoft.fooddelivery.entity.User;
import com.cybersoft.fooddelivery.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<User> getUserByEmailAndPassword(String email, String password) {
        return usersRepository.findByEmailAndPassword(email, password);
    }

}
