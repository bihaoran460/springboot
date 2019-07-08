package com.example.springboot.service.impl;

import com.example.springboot.dao.UserInfoDao;
import com.example.springboot.entity.UserInfo;
import com.example.springboot.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }
}