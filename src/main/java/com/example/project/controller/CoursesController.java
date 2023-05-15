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
    @DeleteMapping("/course/{id}")     //http://localhost:7890/course/101
    public void deleteUser(@PathVariable("id") Integer id){
        coursesService.deleteById(id);
    }

    @GetMapping("/course/{id}")   //http://localhost:7890/course/1
    public List<Courses> getuser(@PathVariable("id") Integer id){
        List<Courses>  list= coursesService.getById(id);
        return list;
    }
    @PutMapping("/course/{id}")    //http://localhost:7890/course/101
    public void update(@RequestBody Courses courses,@PathVariable("id") Integer id){
        coursesService.updateById(courses,id);
    }
}


