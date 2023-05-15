package com.example.project.repository;

import com.example.project.model.Enrollments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentsRepository extends JpaRepository<Enrollments,Long> {
}
