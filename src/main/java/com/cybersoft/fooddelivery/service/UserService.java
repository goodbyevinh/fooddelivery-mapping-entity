package com.cybersoft.fooddelivery.service;

import com.cybersoft.fooddelivery.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
//    public List<Users> getUsers();
    public List<User> getUsersByEmail(String email);

    public List<User> getUserByEmailAndPassword(String email, String password);

    List<User> getUserByEmailPassword(String email, String password);

    List<User> getRoleUser() ;

    List<Map<?, Object>> getRoleUserJoin();

}
