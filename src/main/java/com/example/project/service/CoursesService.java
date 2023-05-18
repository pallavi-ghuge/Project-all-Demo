package com.example.project.service;

import com.example.project.model.Courses;
import com.example.project.model.Users;

import java.util.List;

public interface CourseService {
    List<Courses> getAll();
    Courses save(Courses courses);
    void updateById(Courses courses,Integer courseId);
    void deleteById(Integer courseId);
    List<Courses> getById(Integer courseId);

}
