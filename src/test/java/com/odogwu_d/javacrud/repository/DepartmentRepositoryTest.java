package com.odogwu_d.javacrud.repository;

import com.odogwu_d.javacrud.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.stereotype.Repository;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    @BeforeEach
    void setUp() {

        Department department = Department.builder()
                .departmentName("EEE")
                .departmentAddress("abj")
                .departmentCode("COS-301")
                .build();

        testEntityManager.persist(department);
    }
    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(), "EEE");
    }
}