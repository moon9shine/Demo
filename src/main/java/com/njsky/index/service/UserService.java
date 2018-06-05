package com.njsky.index.service;

import com.njsky.kernel.entity.User;
import com.njsky.index.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mengxu on 2017/9/27.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public int login(User user){
       userMapper.selectUser(user);
        return 0;
    }
}
