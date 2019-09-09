package com.EmployeeManagement.EmpManager.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*
    -Creating an employee class that will be annotated as an entity
    using the @Entity annotation
*/
@Entity
@Table(name = "employee")
public class Employee {
    /*
        -Declaration of attributes
        -Using the @Id annotation to indicate that empId is our primary key
        -Using the @GeneratedValue annotation to generate the EmpId with unique values by table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empID")
   // @NotNull
    private Long empID;

    @Column(name = "title")
   // @NotNull
    private String title;

    @Column(name = "empFirstName")
   // @NotNull
    private String empFirstName;

    @Column(name = "empLastName")
   // @NotNull
    private String empLastName;

    @Column(name = "position")
   // @NotNull
    private String position;

    @Column(name = "gender")
   // @NotNull
    private String gender;

    @Column(name = "idNumber")
   // @NotNull
    private String idNumber;

    @Column(name = "address")
   // @NotNull
    private String address;

    @Column(name="phoneNumber")
   // @NotNull
    private String phoneNumber;

    @Column(name = "emailAddr")
   // @NotNull
    private String emailAddr;

    @Column(name = "deptID")
   // @NotNull
    private String deptID;

    @Column(name = "salary")
   // @NotNull
    private Double salary;

    @Column(name = "hireDate")
   // @NotNull
    private String hireDate;

    /*
        -Declaration of setters, getters and and an empty constructor
    */

    public Employee() {
    }

    public Long getEmpID() {
        return empID;
    }

    public void setEmpID(Long empID) {
        this.empID = empID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getDeptID() {
        return deptID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
