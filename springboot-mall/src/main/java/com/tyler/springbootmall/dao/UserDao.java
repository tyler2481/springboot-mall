package com.tyler.springbootmall.dao;

import com.tyler.springbootmall.dto.UserRegisterRequest;
import com.tyler.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
