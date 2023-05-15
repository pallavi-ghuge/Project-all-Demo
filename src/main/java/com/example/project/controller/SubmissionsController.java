package com.example.project.controller;

import com.example.project.model.Assignments;
import com.example.project.model.Submissions;
import com.example.project.service.AssignmentsService;
import com.example.project.service.SubmissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SubmissionsController {
    @Autowired
    private SubmissionsService submissionsService;
    @GetMapping("/getsub")      //http://localhost:7890/getsub
    public List<Submissions> getall(){
        return  submissionsService.getAll();

    }

    @PostMapping("/sub")    // localhost:7890/sub
    public Submissions saveUsers(@RequestBody Submissions submissions){

        return submissionsService.save(submissions);
    }
    @DeleteMapping("/sub/{id}")     //http://localhost:7890/sub/101
    public void deleteUser(@PathVariable("id") Integer id){
        submissionsService.deleteById(id);
    }

    @GetMapping("/sub/{id}")   //http://localhost:7890/sub/1
    public List<Submissions> getuser(@PathVariable("id") Integer id){
        List<Submissions>  list= submissionsService.getById(id);
        return list;
    }
    @PutMapping("/sub/{id}")    //http://localhost:7890/sub/101
    public void update(@RequestBody Submissions submissions,@PathVariable("id") Integer id){
        submissionsService.updateById(submissions,id);
    }
}
