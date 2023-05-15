package com.example.project.service;

import com.example.project.model.Submissions;
import com.example.project.model.Users;

import java.util.List;

public interface SubmissionsService {
    List<Submissions> getAll();
    Submissions save(Submissions submissions);
    void updateById(Submissions submissions,Integer id);
    void deleteById(Integer id);
    List<Submissions> getById(Integer id);



}
