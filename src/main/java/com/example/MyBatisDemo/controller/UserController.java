package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.entity.User;
import com.example.MyBatisDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getUserById(@PathVariable Long id) {
        return  userService.getUserById(id);
    }

    @GetMapping("all")
    public List<User> getAll() {
        return userService.getAll();
    }

}
