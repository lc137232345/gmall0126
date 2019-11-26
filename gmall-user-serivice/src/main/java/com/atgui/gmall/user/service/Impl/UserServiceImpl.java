package com.atgui.gmall.user.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atgui.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UmsMember> selectAll() {
        return userMapper.selectAll();
    }
}
