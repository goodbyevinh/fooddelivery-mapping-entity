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
//    @Override
//    public List<Users> getUsers() {
//        return usersRepository.findAll();
//    }



    @Override
    public List<User> getUsersByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    @Override
    public List<User> getUserByEmailAndPassword(String email, String password) {
        return usersRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public List<User> getUserByEmailPassword(String email, String password) {
        return usersRepository.getUsersByEmailPassword(email, password);
    }

    @Override
    public List<User> getRoleUser() {
        return usersRepository.getRoleUser();
    }

    @Override
    public List<Map<?, Object>> getRoleUserJoin() {
        return usersRepository.getRoleUserJoin();
    }
}
