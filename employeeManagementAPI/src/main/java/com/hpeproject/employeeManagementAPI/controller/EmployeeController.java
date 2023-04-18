package com.hpeproject.employeeManagementAPI.controller;

import com.hpeproject.employeeManagementAPI.employeeModel.Employee;
import com.hpeproject.employeeManagementAPI.maintainer.Employees;
import com.hpeproject.employeeManagementAPI.manager.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private Employees employees;
    @Autowired
    private EmployeeManager manager;

    @GetMapping
    public List<Employee> getEmployees(){
        manager.createEmployees();
        return employees.getEmployees();
    }
    @PostMapping
    public Employee newEmployee(@RequestBody Employee employee){
        return manager.addEmployee(employee);
    }
}
