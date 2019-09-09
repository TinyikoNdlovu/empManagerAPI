package com.EmployeeManagement.EmpManager.Services;

import com.EmployeeManagement.EmpManager.Models.Employee;
import com.EmployeeManagement.EmpManager.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
    -Annotation to indicate that this is a service class
*/
@Service
public class EmployeeServices {
    /*
        -Injecting the employee repository into the employee service
    */
    @Autowired
    private EmployeeRepository empRepo;

    /*
        -creating a method to retrieve employee
    */
    public List<Employee> getEmployees(){
        return empRepo.findAll();
    }

    /*
        -creating a method to retrieve employee by ID
    */
    public Employee getEmployee(Long id) {
        Optional<Employee> employeeOptional = empRepo.findById(id);

        return employeeOptional.orElse(null);
    }

    /*
        -creating a method to add employee
    */
    public Employee addEmployee(Employee employee) {
        return empRepo.save(employee);
    }


    /*
        -creating a method to update employee
    */
    public Employee updateEmployee(Long id, Employee newEmployee) {
        Optional<Employee> employeeOptional = empRepo.findById(id);

        if(employeeOptional.isPresent()){
            Employee oldEmployee = employeeOptional.get();

            oldEmployee.setEmpID(newEmployee.getEmpID());
            oldEmployee.setTitle(newEmployee.getTitle());
            oldEmployee.setEmpFirstName(newEmployee.getEmpFirstName());
            oldEmployee.setEmpLastName(newEmployee.getEmpLastName());
            oldEmployee.setGender(newEmployee.getGender());
            oldEmployee.setAddress(newEmployee.getAddress());
            oldEmployee.setEmailAddr(newEmployee.getEmailAddr());
            oldEmployee.setDeptID(newEmployee.getDeptID());
            oldEmployee.setSalary(newEmployee.getSalary());
            oldEmployee.setHireDate(newEmployee.getHireDate());

            return empRepo.save(oldEmployee);
        }
        return null;
    }

    /*
            -creating a method to delete employee
    */
    public void deleteEmployee(Employee employee) {
        empRepo.delete(employee);
    }
}
