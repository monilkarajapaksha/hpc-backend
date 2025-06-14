package com.example.hpc_project.monilka.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.kafka.common.protocol.types.Field;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dummy_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", nullable = false, unique = true )
    private  String email;

    @Column(name = "address")
    private String address;

    @Column(name = "job")
    private String job;

    @Column(name = "company")
    private String company;

    @Column(name = "date_joined")
    private String date_joined;

    @Column(name = "salary")
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(String date_joined) {
        this.date_joined = date_joined;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
