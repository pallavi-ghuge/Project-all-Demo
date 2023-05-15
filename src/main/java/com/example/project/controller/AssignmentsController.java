package com.example.project.controller;

import com.example.project.model.Assignments;
import com.example.project.model.Courses;
import com.example.project.service.AssignmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AssignmentsController {
    @Autowired
    private AssignmentsService assignmentsService;
    @GetMapping("/getAssi")      //http://localhost:7890/getAssi
    public List<Assignments> getall(){
        return  assignmentsService.getAll();

    }

    @PostMapping("/assi")    // localhost:7890/assi
    public Assignments saveUsers(@RequestBody Assignments assignments){

        return assignmentsService.save(assignments);
    }
    @DeleteMapping("/assi/{id}")     //http://localhost:7890/assi/101
    public void deleteUser(@PathVariable("id") Integer id){
        assignmentsService.deleteById(id);
    }

    @GetMapping("/assi/{id}")   //http://localhost:7890/assi/1
    public List<Assignments> getuser(@PathVariable("id") Integer id){
        List<Assignments>  list= assignmentsService.getById(id);
        return list;
    }
    @PutMapping("/assi/{id}")    //http://localhost:7890/assi/101
    public void update(@RequestBody Assignments assignments,@PathVariable("id") Integer id){
        assignmentsService.updateById(assignments,id);
    }
}
