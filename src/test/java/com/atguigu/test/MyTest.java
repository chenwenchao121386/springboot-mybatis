package com.atguigu.test;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void testDruidDataSource(){
        System.out.println("dataSource = " + dataSource.getClass());
    }
    @Autowired
    UserService userService;
    @Autowired
    User user;
    /*@Test
    public void testFindAll(){
        List<User> all = userService.findUsers();
        System.out.println("all = " + all);
        all.forEach(x->System.out.println(x));
        all.forEach(System.out::println);
        System.out.println(dataSource.getClass());
        System.out.println("user = " + user);
    }*/
}
