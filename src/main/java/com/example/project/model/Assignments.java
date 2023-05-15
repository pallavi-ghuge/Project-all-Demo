package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Assignments {
    @Id
    private Integer id;
    private Integer course_id;
    private String name;
    private LocalDate due_date;

    public Assignments() {
    }

    public Assignments(Integer id, Integer course_id, String name, LocalDate due_date) {
        this.id = id;
        this.course_id = course_id;
        this.name = name;
        this.due_date = due_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDue_date() {
        return due_date;
    }

    public void setDue_date(LocalDate due_date) {
        this.due_date = due_date;
    }

    @Override
    public String toString() {
        return "Assignments{" +
                "id=" + id +
                ", course_id=" + course_id +
                ", name='" + name + '\'' +
                ", due_date=" + due_date +
                '}';
    }
}
