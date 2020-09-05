package com.atguigu.controller;

import com.atguigu.domain.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String he(Model model){
        model.addAttribute("hello", "你好，李驷!");
        System.out.println("model = " + "klsjdljlk");
//        User user = new User(3306, "武大", "231231", "武大郎");
        User user = new User();
        model.addAttribute("user",user);

        return "demo1";
    }
}
