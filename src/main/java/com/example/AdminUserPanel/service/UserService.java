package com.example.AdminUserPanel.service;

import com.example.AdminUserPanel.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}