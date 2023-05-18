package com.example.project.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Courses {
    @Id
    private int courseId;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="teacher_id")
    private Users users;

    private LocalDate start_date;

    private LocalDate end_date;



}
