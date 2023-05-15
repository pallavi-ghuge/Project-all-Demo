package com.example.project.service;

import com.example.project.model.Courses;
import com.example.project.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService{
    @Autowired
    CoursesRepository coursesRepository;
    @Override
    public List<Courses> getAll() {
        List<Courses> list=coursesRepository.findAll();
        return list;
    }

    @Override
    public Courses save(Courses courses) {
        Courses courses1=coursesRepository.save(courses);
        return courses1;
    }

    @Override
    public void updateById(Courses courses, Integer id) {
        courses.setId(id);
        coursesRepository.save(courses);

    }

    @Override
    public void deleteById(Integer id) {
        coursesRepository.deleteById(Long.valueOf(id));

    }

    @Override
    public List<Courses> getById(Integer id) {
        List<Courses> list=coursesRepository.findAllById(id);
        return null;
    }
}
