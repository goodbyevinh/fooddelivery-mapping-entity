package com.cybersoft.fooddelivery.controller;

import com.cybersoft.fooddelivery.entity.User;
import com.cybersoft.fooddelivery.payload.ResponseData;
import com.cybersoft.fooddelivery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    UserService userService;


    @PostMapping("")
    public Object login(@RequestParam("email") String email,
                        @RequestParam("password") String password
                        ) {
        ResponseData responseData = new ResponseData();
        responseData.setStatusCode(200);

        List<User> list = userService.getUserByEmailAndPassword(email, password);
        responseData.setSuccess(list != null);
        responseData.setData(list);
        return responseData;
    }
}
