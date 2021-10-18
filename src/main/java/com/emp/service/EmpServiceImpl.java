package com.emp.service;

import com.emp.dao.EmpDao;
import com.emp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empService")
public class EmpServiceImpl implements EmpService{
    @Autowired
    EmpDao empDao;
    @Override
    public void addEmployee(Employee employee) {
    empDao.addEmployee(employee);
    }

    @Override
    public Employee find(int empId) {
        return empDao.find(empId);
    }

    @Override
    public List<Employee> findAll() {
        return empDao.findAll();
    }
}
