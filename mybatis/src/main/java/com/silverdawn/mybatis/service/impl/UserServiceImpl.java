package com.silverdawn.mybatis.service.impl;

import com.silverdawn.mybatis.dao.UserMapper;
import com.silverdawn.mybatis.domain.User;
import com.silverdawn.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByName(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
