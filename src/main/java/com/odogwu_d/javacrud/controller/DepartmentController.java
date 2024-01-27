package com.odogwu_d.javacrud.controller;


import com.odogwu_d.javacrud.entity.Department;
import com.odogwu_d.javacrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department savedepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Delete Successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") long departmentId,
                                           @RequestBody Department department) {
        return departmentService.updateDepartmentById(departmentId, department);
    }
}
