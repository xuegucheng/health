package com.itheima.dao;

import com.itheima.pojo.User;

public interface UserDao {
    public User findByUsername(String username);
}
