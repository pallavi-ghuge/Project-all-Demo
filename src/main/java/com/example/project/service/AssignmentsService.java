package com.example.project.service;

import com.example.project.model.Assignments;
import com.example.project.model.Users;

import java.util.List;

public interface AssignmentsService {
    List<Assignments> getAll();
    Assignments save(Assignments assignments);
    void updateById(Assignments assignments,Integer id);
    void deleteById(Integer id);
    List<Assignments> getById(Integer id);
}
