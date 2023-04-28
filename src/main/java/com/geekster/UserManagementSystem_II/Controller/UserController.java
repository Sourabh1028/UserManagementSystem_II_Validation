package com.geekster.UserManagementSystem_II.Controller;

import com.geekster.UserManagementSystem_II.Model.User;
import com.geekster.UserManagementSystem_II.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping(value = "/getUser/{id}")
    public User getUserById(@PathVariable String id){

        return userService.getUserById(id);
    }

    @PostMapping(value = "/addUser")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public String deleteById(@Valid @PathVariable String id){
        return userService.removeById(id);
    }

    @PutMapping(value = "/update/{id}")
    public String updateById(@Valid @PathVariable String id, @Valid @RequestBody User user){
        return userService.updateUser(id, user);
    }

}
