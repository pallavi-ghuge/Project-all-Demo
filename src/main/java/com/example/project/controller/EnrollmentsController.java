package com.example.project.controller;

import com.example.project.model.Enrollments;
import com.example.project.model.Users;
import com.example.project.service.EnrollmentsService;
import com.example.project.service.UserService;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnrollmentsController {
    @Autowired
    private EnrollmentsService enrollmentsService;
    @GetMapping("/getenroll")      //http://localhost:7890/getenroll
    public List<Enrollments> getall(){
        return  enrollmentsService.getAll();

    }

    @PostMapping("/enroll")    // localhost:7890/enroll
    public Enrollments saveUsers(@RequestBody Enrollments enrollments){

        return enrollmentsService.save(enrollments);
    }
    @DeleteMapping("/enroll/{id}")     //http://localhost:7890/enroll/101
    public void deleteUser(@PathVariable("id") Integer id){
        enrollmentsService.deleteById(id);
    }

    @GetMapping("/enroll/{id}")   //http://localhost:7890/enroll/1
    public List<Enrollments> getuser(@PathVariable("id") Integer id){
        List<Enrollments>  list= enrollmentsService.getById(id);
        return list;
    }
    @PutMapping("/enroll/{id}")    //http://localhost:7890/enroll/101
    public void update(@RequestBody Enrollments enrollments,@PathVariable("id") Integer id){
        enrollmentsService.updateById(enrollments,id);
    }


}
