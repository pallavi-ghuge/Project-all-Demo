package com.example.project.controller;

import com.example.project.model.Courses;
import com.example.project.model.Users;
import com.example.project.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @GetMapping("/getcourse")      //http://localhost:7890/getcourse
    public List<Courses> getall(){
        return  coursesService.getAll();

    }

    @PostMapping("/courseadd")    // localhost:7890/course/courseadd
    public Courses saveUsers(@RequestBody Courses courses){

        return coursesService.save(courses);
    }
    @DeleteMapping("/course/{courseId}")     //http://localhost:7890/course/101
    public void deleteUser(@PathVariable("courseId") Integer courseId){
        coursesService.deleteById(courseId);
    }

    @GetMapping("/course/{courseId}")   //http://localhost:7890/course/1
    public List<Courses> getuser(@PathVariable("courseId") Integer courseId){
        List<Courses>  list= coursesService.getById(courseId);
        return list;
    }
    @PutMapping("/course/{courseId}")    //http://localhost:7890/course/101
    public void update(@RequestBody Courses courses,@PathVariable("courseId") Integer courseId){
        coursesService.updateById(courses,courseId);
    }
}


