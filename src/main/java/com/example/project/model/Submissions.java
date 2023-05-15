package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Submissions {
    @Id
    private Integer id;
    private  Integer assignment_id;
    private  Integer student_id;
    private float grade;
    private String feedback;

    public Submissions() {
    }

    public Submissions(Integer id, Integer assignment_id, Integer student_id, float grade, String feedback) {
        this.id = id;
        this.assignment_id = assignment_id;
        this.student_id = student_id;
        this.grade = grade;
        this.feedback = feedback;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(Integer assignment_id) {
        this.assignment_id = assignment_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Submissions{" +
                "id=" + id +
                ", assignment_id=" + assignment_id +
                ", student_id=" + student_id +
                ", grade=" + grade +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
