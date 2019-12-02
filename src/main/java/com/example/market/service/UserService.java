package com.example.market.service;

import com.example.market.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<Map<String,Object>> findAll();
    public void deluser(String id);
    public User findUser(String id);
}
