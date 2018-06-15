package com.ks_xlm.dao;

import com.ks_xlm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
注册用户接口
 */

@Repository
//@Mapper
public interface UserDao {

    //用户注册增加
    void userAdd(User user);

    //用户信息修改
    void userUpdate(User user);

    //用户列表查询
    User userSelect(String username);

    //String userVerify(User user);
}