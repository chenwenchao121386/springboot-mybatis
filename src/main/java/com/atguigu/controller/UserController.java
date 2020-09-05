package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public List<User> findUser(){
        return userService.findUsers();
    }
    @RequestMapping("/findUser/{id}")
    public User findUserById(@PathVariable("id") Integer id){
        return userService.findUserById(id);
    }
    @RequestMapping("/save")
    public void saveUser(User user){
        userService.saveUser(user);
    }
    @RequestMapping("/update")
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }
}
