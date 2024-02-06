package com.example.springbootvue.controller;

import com.example.springbootvue.entity.User;
import com.example.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello() {
        return  "Hello";
    }

    @Autowired
    private UserService userService;
 @ResponseBody
    @RequestMapping(value="/list2",method = RequestMethod.GET)
    public List<User> list2() {
        return  userService.listAll();
    }

    @RequestMapping(value="/getAge",method = RequestMethod.GET)
    public int getAge(int id) {
        return  userService.getAge(id);
    }

    @RequestMapping(value="/list22",method = RequestMethod.GET)
    public String hello2() {
        return  "Hello222";
    }

    @RequestMapping(value="/list224",method = RequestMethod.GET)
    public String hello4() {
        return  "Hello22255";
    }
}
