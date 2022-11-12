package com.cybersoft.fooddelivery.service;

import com.cybersoft.fooddelivery.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {


    public List<User> getUserByEmailAndPassword(String email, String password);




}
