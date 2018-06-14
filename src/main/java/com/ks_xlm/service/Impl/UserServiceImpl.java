package com.ks_xlm.service.Impl;

import com.ks_xlm.dao.UserDao;
import com.ks_xlm.entity.User;
import com.ks_xlm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void userAdd(User user) {
        userDao.userAdd(user);
    }

    @Override
    public void userUpdate(User user) {
        userDao.userUpdate(user);
    }

    @Override
    public User userSelect(String username) {
        return userDao.userSelect(username);
    }
}
