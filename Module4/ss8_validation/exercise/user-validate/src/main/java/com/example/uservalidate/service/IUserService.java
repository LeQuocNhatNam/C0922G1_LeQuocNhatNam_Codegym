package com.example.uservalidate.service;

import com.example.uservalidate.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void save(User user);

}
