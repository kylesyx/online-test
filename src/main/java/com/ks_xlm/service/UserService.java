package com.ks_xlm.service;

import com.ks_xlm.entity.User;

import java.util.List;

public interface UserService {
    //用户注册增加
    void userAdd(User user);
    //用户信息修改
    void userUpdate(User user);
    //用户列表查询
    User userSelect(String username);
}
