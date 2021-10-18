package com.emp.dao;

import com.emp.model.Employee;

import java.util.List;

public interface EmpDao {
    public void addEmployee(Employee employee);

    public Employee find(int empId);

    public List<Employee> findAll();
}
