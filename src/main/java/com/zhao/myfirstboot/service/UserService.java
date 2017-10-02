package com.zhao.myfirstboot.service;

import com.zhao.myfirstboot.dao.UserDao;
import com.zhao.myfirstboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务层
 * Created by zhaoxudong on 2017/9/29.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User login(User user){
        return userDao.login(user.getUsername(),user.getPassword(),user.getKey());
    }
}
