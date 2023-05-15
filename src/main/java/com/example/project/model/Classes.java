package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Classes {
    @Id
    private Integer id;
    private Integer course_id;
    private Integer teacher_id;
    //private LocalDateTime
}
