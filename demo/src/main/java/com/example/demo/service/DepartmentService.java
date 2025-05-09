package com.example.demo.service;

import org.modelmapper.ModelMapper;

import com.example.demo.contract.DepartmentDto;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

public class DepartmentService {
    private static ModelMapper modelMapper;
    private final static DepartmentRepository departmentRepository = null;

    public static String saveDepartment(DepartmentDto departmentData) {
        Department department= modelMapper.map(departmentData,Department.class);
        departmentRepository.save(department);
        return"Register Successfully";
    }
        
}

