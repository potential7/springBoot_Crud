package com.odogwu_d.javacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.odogwu_d.javacrud.entity.Department;
import org.springframework.stereotype.Repository;



@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);


}
