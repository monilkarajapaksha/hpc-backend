package com.example.hpc_project.monilka.controller;

import com.example.hpc_project.monilka.entity.User;
import com.example.hpc_project.monilka.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @GetMapping("/total_salary")
    public ResponseEntity<Integer> getTotalSalary(){
        int totalSalary = userService.getTotalSalary();
        return new ResponseEntity<>(totalSalary, HttpStatus.OK);
    }

}
