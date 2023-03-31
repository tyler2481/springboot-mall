package com.tyler.springbootmail.service;

import com.tyler.springbootmail.dto.UserRegisterRequest;
import com.tyler.springbootmail.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

}
