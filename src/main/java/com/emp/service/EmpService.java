package com.emp.service;

import com.emp.model.Employee;

import java.util.List;

public interface EmpService {
    public void addEmployee(Employee employee);
    public Employee find(int empId);
    public List<Employee> findAll();
}
