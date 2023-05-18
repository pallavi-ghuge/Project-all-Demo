package com.example.project.service;

import com.example.project.model.Courses;
import com.example.project.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public List<Courses> getAll() {
        List<Courses> list = coursesRepository.findAll();
        return list;
    }

    @Override
    public Courses save(Courses courses) {
        Courses courses1 = coursesRepository.save(courses);
        return courses1;
    }

    @Override
    public void updateById(Courses courses, Integer courseId) {
        courses.setCourseId(courseId);
        coursesRepository.save(courses);

    }

    @Override
    public void deleteById(Integer courseId) {
        coursesRepository.deleteById(Long.valueOf(courseId));

    }

    @Override
    public List<Courses> getById(Integer courseId) {
        List<Courses> list = coursesRepository.findAllById(courseId);
        return list;
    }
}
