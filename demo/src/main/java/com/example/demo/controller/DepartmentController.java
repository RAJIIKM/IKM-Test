package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.contract.DepartmentDto;
import com.example.demo.service.DepartmentService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController
public class DepartmentController {
    private DepartmentService departmentService;

@PostMapping("/Department")//save

public String SaveDepartment(@RequestBody DepartmentDto departmentData){
    return DepartmentService.saveDepartment(departmentData);
}
}
