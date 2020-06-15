package com.yj.shirospringboot.service;

import com.yj.shirospringboot.entity.User;

public interface UserService {
    public User selectByUsername(String username);
}
