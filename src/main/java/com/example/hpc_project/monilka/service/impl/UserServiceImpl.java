package com.example.hpc_project.monilka.service.impl;

import com.example.hpc_project.monilka.Repository.UserRepository;
import com.example.hpc_project.monilka.entity.User;
import com.example.hpc_project.monilka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public int getTotalSalary() {
        List<Integer> salaries = userRepository.getAllSalaries();
        int totalSalary = 0;
        for (int value: salaries) {
            totalSalary += value;
        }
        return totalSalary;
    }
}
