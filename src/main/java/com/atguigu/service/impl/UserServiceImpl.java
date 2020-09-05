package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findById(id).get();
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }
   /* @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }*/
}
