package com.example.authorjdbc.service;

import com.example.authorjdbc.Entity.User;

public interface UserService {
    public User findUserByUsername(String username);
}
