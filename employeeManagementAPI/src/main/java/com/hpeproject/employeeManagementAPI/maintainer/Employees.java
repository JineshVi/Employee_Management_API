package com.hpeproject.employeeManagementAPI.maintainer;

import com.hpeproject.employeeManagementAPI.employeeModel.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Employees {
    private List<Employee> employees;
}
