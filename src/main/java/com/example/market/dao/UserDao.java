package com.example.market.dao;

import com.example.market.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface UserDao {
    public List<Map<String,Object>> findAll();
    public void deluser(String id);
    public User findUser(String id);
    public void updateUser(User user);
}
