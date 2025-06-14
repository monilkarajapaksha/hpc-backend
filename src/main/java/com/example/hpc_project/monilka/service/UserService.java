package com.example.hpc_project.monilka.service;

import com.example.hpc_project.monilka.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    int getTotalSalary();
}
