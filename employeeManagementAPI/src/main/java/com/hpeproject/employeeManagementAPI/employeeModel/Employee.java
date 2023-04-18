package com.hpeproject.employeeManagementAPI.employeeModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Employee {
    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;
}
