package com.atguigu.dao;

import com.atguigu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
//@Repository
public interface UserDao extends JpaRepository<User,Integer> {
//    public List<User> findAll();
}
