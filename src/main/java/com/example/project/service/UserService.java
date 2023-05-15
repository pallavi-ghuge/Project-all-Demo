package com.example.project.service;

import com.example.project.model.Users;

import java.util.List;

public interface UserService {

    List<Users> getAll();
    Users save(Users user);
    void updateById(Users users,Integer id);
    void deleteById(Integer id);
    List<Users> getById(Integer id);




}
