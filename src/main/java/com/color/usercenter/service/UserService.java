package com.color.usercenter.service;

import com.color.usercenter.dao.user.UserMapper;
import com.color.usercenter.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
