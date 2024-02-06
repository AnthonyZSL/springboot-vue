package com.example.springbootvue.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootvue.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> listAll();
    int getAge(int id);
}
