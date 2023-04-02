package com.tyler.springbootmail.dao;

import com.tyler.springbootmail.dto.UserRegisterRequest;
import com.tyler.springbootmail.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
