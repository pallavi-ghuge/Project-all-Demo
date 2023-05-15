package com.example.project.repository;

import com.example.project.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Long> {
    List<Courses> findAllById(Integer id);
}
