package com.color.usercenter.controller;

import com.color.usercenter.dao.user.UserMapper;
import com.color.usercenter.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/addUser")
    public User addUser(){
        User user = new User();
        user.setWxId("xxx");
        user.setWxNickname("xxx");
        user.setAvatarUrl("xxx");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);

        return user;
    }

}
