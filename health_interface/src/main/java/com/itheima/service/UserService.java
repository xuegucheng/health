package com.itheima.service;

import com.itheima.pojo.User;

public interface UserService {
    public User findByUsername(String username);
}
