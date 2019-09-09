package com.EmployeeManagement.EmpManager.Repository;

import com.EmployeeManagement.EmpManager.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    -Creating an employees repo which will empty
*/
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
