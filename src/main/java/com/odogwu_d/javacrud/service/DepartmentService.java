package com.odogwu_d.javacrud.service;

import com.odogwu_d.javacrud.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById( long departmentId);

   public void deleteDepartmentById(long departmentId);

   public Department updateDepartmentById(long departmentId, Department department);
}
