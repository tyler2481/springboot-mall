package com.tyler.springbootmall.service;

import com.tyler.springbootmall.dto.UserLoginRequest;
import com.tyler.springbootmall.dto.UserRegisterRequest;
import com.tyler.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
