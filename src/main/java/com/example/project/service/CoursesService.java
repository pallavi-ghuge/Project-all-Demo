package com.example.project.service;

import com.example.project.model.Courses;
import com.example.project.model.Users;

import java.util.List;

public interface CoursesService {
    List<Courses> getAll();
    Courses save(Courses courses);
    void updateById(Courses courses,Integer id);
    void deleteById(Integer id);
    List<Courses> getById(Integer id);

}
