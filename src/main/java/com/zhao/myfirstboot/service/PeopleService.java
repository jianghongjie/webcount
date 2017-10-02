package com.zhao.myfirstboot.service;

import com.zhao.myfirstboot.dao.PeopleDao;
import com.zhao.myfirstboot.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 人服务层
 * Created by zhaoxudong on 2017/9/27.
 */
@Service
public class PeopleService {
    @Autowired
    private PeopleDao peopleDao;

    public List<People> index(){
        return peopleDao.index();
    }
}
