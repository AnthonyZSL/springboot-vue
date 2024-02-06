package com.example.springbootvue.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootvue.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> listAll();

    int getAge(int id);
}