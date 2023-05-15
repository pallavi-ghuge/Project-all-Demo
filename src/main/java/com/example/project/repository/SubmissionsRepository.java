package com.example.project.repository;

import com.example.project.model.Submissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionsRepository extends JpaRepository<Submissions,Long> {


    List<Submissions> findAllById(Integer id);
}
