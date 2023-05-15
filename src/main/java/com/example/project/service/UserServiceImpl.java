package com.example.project.service;

import com.example.project.model.Users;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> getAll() {
        List<Users> users=userRepository.findAll();
        return users;
    }

    @Override
    public Users save(Users user) {
        Users user1=userRepository.save(user);
        return user1;
    }

    @Override
    public void updateById(Users users, Integer id) {
        users.setId(id);  //user will sure
        userRepository.save(users);

    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(Long.valueOf(id));

    }

    @Override
    public List<Users> getById(Integer id) {
        List<Users> list=userRepository.findAllById(id);
        return list;
    }
}
