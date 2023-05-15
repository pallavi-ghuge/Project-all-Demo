package com.example.project.controller;

import com.example.project.model.Users;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")      //http://localhost:7890/get
    public List<Users> getall(){
        return  userService.getAll();

    }

    @PostMapping("/users")    // localhost:7890/users
    public Users saveUsers(@RequestBody Users user){

        return userService.save(user);
    }
    @DeleteMapping("/users/{id}")     //http://localhost:7890/users/101
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteById(id);
    }

    @GetMapping("/user/{id}")   //http://localhost:7890/user/1
    public List<Users> getuser(@PathVariable("id") Integer id){

       List<Users>  list= userService.getById(id);

       return list;
    }
    @PutMapping("/user/{id}")    //http://localhost:7890/user/101
    public void update(@RequestBody Users users,@PathVariable("id") Integer id){
        userService.updateById(users,id);
    }
}
