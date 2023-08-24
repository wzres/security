package com.wzres.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wzres.domain.LoginUser;
import com.wzres.domain.User;
import com.wzres.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;


/**
 * @ClassName UserDetailServiceImpl
 * @date 2023-08-18 18:58
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    //TODO 1、用数据库查询

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
