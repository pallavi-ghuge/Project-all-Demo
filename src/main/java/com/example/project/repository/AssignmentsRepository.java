package com.example.project.repository;

import com.example.project.model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentsRepository extends JpaRepository<Assignments,Long> {
    List<Assignments> findAllById(Integer id);
}
