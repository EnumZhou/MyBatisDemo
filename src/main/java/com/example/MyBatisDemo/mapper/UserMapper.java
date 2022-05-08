package com.example.MyBatisDemo.mapper;

import com.example.MyBatisDemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    User getUserById(Long id);

    List<User> findAll();
}
