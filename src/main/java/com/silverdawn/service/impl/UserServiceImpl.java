package com.silverdawn.service.impl;

import com.silverdawn.dao.UserMapper;
import com.silverdawn.domain.User;
import com.silverdawn.service.UserService;
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
