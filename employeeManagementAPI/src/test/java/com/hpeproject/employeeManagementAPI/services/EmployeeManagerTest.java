package com.hpeproject.employeeManagementAPI.services;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.hpeproject.employeeManagementAPI.employeeModel.Employee;
import com.hpeproject.employeeManagementAPI.maintainer.Employees;
import com.hpeproject.employeeManagementAPI.manager.EmployeeManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeManagerTest {

    @Mock
    private Employees employees;

    @InjectMocks
    private EmployeeManager employeeManager;

    @Test
    public void testAddEmployee() {
        // Create a new employee
        Employee newEmployee = new Employee("5", "Sarah", "Johnson", "sarahj@gmail.com", "Sales Representative");

        // Stub the behavior of the Employees object to return the employeelist when getEmployees is called
        when(employees.getEmployees()).thenReturn(employeeManager.employeelist);

        // Call the addEmployee method
        Employee addedEmployee = employeeManager.addEmployee(newEmployee);

        // Verify that the new employee has been added to the list
        assertTrue(employeeManager.employeelist.contains(newEmployee));
        assertEquals(newEmployee, addedEmployee);
    }

    @Test
    public void testCreateEmployees() {
        List<Employee> expectedEmployees = Arrays.asList(
                new Employee("1","John","Morgan","johnmorgan22@gmail.com","Marketing Manager"),
                new Employee("2","David","Huber","davidhhr@ymail.com","Business Analyst"),
                new Employee("3","Joe","Gunner","gunner56@gmail.com","Executive"),
                new Employee("4","Roy","Nelson","nelsonroy12@gmail.com","Project Manager"));

        employeeManager.createEmployees();

        verify(employees).setEmployees(expectedEmployees);
    }
}
