package com.jadyer.demo.controller;

import com.jadyer.demo.entity.User;
import com.jadyer.demo.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserJpa mUserJpa;

    @RequestMapping(value =  "/getallusers")
    public List<User>  getAllUsers(){
        return mUserJpa.findAll();
    }
}
