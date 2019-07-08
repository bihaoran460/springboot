package com.example.springboot.service;

import com.example.springboot.entity.UserInfo;

public interface UserInfoService {
        /** 通过username查找用户信息；*/
        public UserInfo findByUsername(String username);

}
