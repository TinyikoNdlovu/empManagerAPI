package com.EmployeeManagement.EmpManager.Controller;

import com.EmployeeManagement.EmpManager.Models.Employee;
import com.EmployeeManagement.EmpManager.Services.EmployeeServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    -Annotation @RestController to show that this class is a controller class
    -Annotation @RequestMapping to tell the server that when teh web page is open it must start at
    the employees page showing all employees e.g localhost:8080/employees

 */

@RestController
@RequestMapping("employee")
public class EmployeeController {
    /*
            -Creating an employee services object to be used when referencing anything it needs
    */
    private final EmployeeServices empService;

    /*
        -Creating a Employees Controller method that'll take an empService object as a parameter
        of type EmployeeServices
    */
    public EmployeeController(EmployeeServices empService){
        this.empService = empService;
    }

    /*
        -Creating a controller to display all employees
    */
    @GetMapping("all")
    public List<Employee> getEmployees(){
        return empService.getEmployees();
    }

    /*
        -Creating a controller to display employees by ID
    */
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        Employee employee = empService.getEmployee(id);

        if(id == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(empService.getEmployee(id));
    }

    /*
        -Creating a controller to add employees
    */
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return  empService.addEmployee(employee);
    }

    /*
        -Creating a controller to update employees
    */
    @PutMapping("update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        Employee oldEmployee = empService.getEmployee(id);

        if(oldEmployee == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(empService.updateEmployee(id, employee));
    }

    /*
        -Creating a controller to delete employees
    */
   @DeleteMapping("delete/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable Long id){
        Employee employee = empService.getEmployee(id);

        if(employee == null){
            return ResponseEntity.notFound().build();
        }
        empService.deleteEmployee(employee);
        return ResponseEntity.ok().build();
   }
}
