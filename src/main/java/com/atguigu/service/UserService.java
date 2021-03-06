package com.atguigu.service;

import com.atguigu.domain.User;

import java.util.List;

public interface UserService {
    //    List<User> findAll();
    List<User> findUsers();

    User findUserById(Integer id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Integer id);
}
