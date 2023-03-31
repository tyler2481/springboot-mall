package com.tyler.springbootmail.service.impl;

import com.tyler.springbootmail.dao.UserDao;
import com.tyler.springbootmail.dto.UserRegisterRequest;
import com.tyler.springbootmail.model.User;
import com.tyler.springbootmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
