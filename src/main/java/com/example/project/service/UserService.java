package com.example.project.service;

import com.example.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User save(User user);


}
