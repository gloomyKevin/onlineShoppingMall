package com.example.market.service.impl;

import com.example.market.dao.UserDao;
import com.example.market.model.User;
import com.example.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "userService")
public  class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao ;

    @Override
    public List<Map<String, Object>> findAll() {
        return userDao.findAll();
    }

    @Override
    public void deluser(String id) {
        userDao.deluser(id);
    }

    @Override
    public User findUser(String id) {
        return userDao.findUser(id);
    }
}
