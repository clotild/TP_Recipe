package com.example.cuisine.dao;

import com.example.cuisine.model.User;

public interface UserDao extends GenericDao <User, Long> {
    User findByEmail(String email);
}
