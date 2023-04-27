package com.example.cuisine.service;

import com.example.cuisine.dao.UserDao;
import com.example.cuisine.dao.UserJdbcDao;
import com.example.cuisine.model.User;

public class UserService {
    private UserDao userDao = new UserJdbcDao();

    public boolean login(String email, String password) {
        User userFound = userDao.findByEmail(email);
        if (userFound != null) {
            return userFound.getPassword().equals(password);
        }
        return false;
    }
}
