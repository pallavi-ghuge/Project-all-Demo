package com.example.project.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Courses {
    @Id
    private int id;
    private String name;
    private Integer teacher_id;
    private LocalDate start_date;
    private LocalDate end_date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role")
    Users u;

    public Courses() {
    }

    public Courses(int id, String name, Integer teacher_id, LocalDate start_date, LocalDate end_date) {
        this.id = id;
        this.name = name;
        this.teacher_id = teacher_id;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher_id=" + teacher_id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }
}
