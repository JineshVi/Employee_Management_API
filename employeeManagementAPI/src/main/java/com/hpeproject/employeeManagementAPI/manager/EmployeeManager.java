package com.hpeproject.employeeManagementAPI.manager;

import com.hpeproject.employeeManagementAPI.employeeModel.Employee;
import com.hpeproject.employeeManagementAPI.maintainer.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {
    @Autowired
    private Employees employees;

    public List<Employee> employeelist = new ArrayList<>();

    public void createEmployees(){
        
        Employee e1 = new Employee("1","John","Morgan","johnmorgan22@gmail.com","Marketing Manager");
        Employee e2 = new Employee("2","David","Huber","davidhhr@ymail.com","Business Analyst");
        Employee e3 = new Employee("3","Joe","Gunner","gunner56@gmail.com","Executive");
        Employee e4 = new Employee("4","Roy","Nelson","nelsonroy12@gmail.com","Project Manager");
        employeelist.add(e1);
        employeelist.add(e2);
        employeelist.add(e3);
        employeelist.add(e4);

        employees.setEmployees(employeelist);
    }

    public Employee addEmployee(Employee employee){
        employeelist.add(employee);
        return employee;
    }
}
