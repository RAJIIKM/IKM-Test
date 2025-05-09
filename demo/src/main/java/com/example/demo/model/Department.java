package com.example.demo.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Department {
 @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
 
    @Column(unique = true, nullable = false)
    private String departmentCode;
 
    @Column(nullable = false)
    private String departmentName;
 
    private String description;
 
    private boolean active;
}
   