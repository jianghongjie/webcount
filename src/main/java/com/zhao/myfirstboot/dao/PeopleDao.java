package com.zhao.myfirstboot.dao;

import com.zhao.myfirstboot.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 人接口
 * Created by zhaoxudong on 2017/9/27.
 */
@Repository
public interface PeopleDao {
    //@Select("SELECT * FROM people")
    List<People> index();
}
