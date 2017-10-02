package com.zhao.myfirstboot.dao;

import com.zhao.myfirstboot.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 用户Dao层
 * Created by zhaoxudong on 2017/9/29.
 */
@Repository
public interface UserDao {

    //登录
    User login(@Param("username") String username, @Param("password") String password, @Param("key") int key);
}
