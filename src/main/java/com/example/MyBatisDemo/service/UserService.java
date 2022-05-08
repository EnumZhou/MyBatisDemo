package com.example.MyBatisDemo.service;

import com.example.MyBatisDemo.entity.User;
import com.example.MyBatisDemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User getUserById(Long id){
        return userMapper.getUserById(id);
    }

    public List<User> getAll() {
        return userMapper.findAll();
    }
}
