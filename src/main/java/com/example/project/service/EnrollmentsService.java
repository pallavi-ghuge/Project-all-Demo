package com.example.project.service;

import com.example.project.model.Enrollments;
import com.example.project.model.Users;

import java.util.List;

public interface EnrollmentsService {
    List<Enrollments> getAll();
    Enrollments save(Enrollments enrollments);
    void updateById(Enrollments enrollments,Integer id);
    void deleteById(Integer id);
    List<Enrollments> getById(Integer id);
}
