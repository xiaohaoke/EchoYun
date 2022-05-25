package com.example.echoyun.service;

import com.example.echoyun.dao.UserMapper;
import com.example.echoyun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById (int id) {
        return userMapper.selectById(id);
    }

}
