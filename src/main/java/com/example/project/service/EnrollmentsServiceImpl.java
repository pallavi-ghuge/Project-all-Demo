package com.example.project.service;

import com.example.project.model.Enrollments;
import com.example.project.repository.EnrollmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnrollmentsServiceImpl implements EnrollmentsService{

    @Autowired
    EnrollmentsRepository enrollmentsRepository;
    @Override
    public List<Enrollments> getAll() {
        List<Enrollments> enrollments=enrollmentsRepository.findAll();
        return enrollments;
    }

    @Override
    public Enrollments save(Enrollments enrollments) {
        return null;
    }

    @Override
    public void updateById(Enrollments enrollments, Integer id) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Enrollments> getById(Integer id) {
        return null;
    }
}
