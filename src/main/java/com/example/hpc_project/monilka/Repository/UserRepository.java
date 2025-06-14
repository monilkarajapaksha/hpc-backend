package com.example.hpc_project.monilka.Repository;

import com.example.hpc_project.monilka.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u.salary FROM User u")
    List<Integer> getAllSalaries();
}
