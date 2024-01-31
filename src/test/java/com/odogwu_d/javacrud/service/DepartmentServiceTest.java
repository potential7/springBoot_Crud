package com.odogwu_d.javacrud.service;

import com.odogwu_d.javacrud.entity.Department;
import com.odogwu_d.javacrud.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
     @Autowired
    private DepartmentService departmentService;

     @MockBean
     private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder().departmentName("EEE")
                .departmentAddress("abj")
                .departmentCode("COS-301")
                .departmentId(1L).build();

        Mockito.when(departmentRepository
                .findByDepartmentNameIgnoreCase("EEE")).thenReturn(department);
    }
    @Test
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "EEE";
        Department found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}
