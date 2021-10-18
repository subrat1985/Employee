package com.emp.dao;

import com.emp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Qualifier("empDao")
public class EmpDaoImpl implements EmpDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void addEmployee(Employee employee) {
        jdbcTemplate.update("INSERT INTO employee (empId, name, address) VALUES (?, ?, ?)",
                employee.getEmpId(), employee.getName(), employee.getAddress());
        System.out.println("Employee Added!!");
        System.out.println(employee);
    }

    @Override
    public Employee find(int empId) {
        Employee employee = jdbcTemplate.queryForObject("SELECT * FROM employee where empId = ? ",
                new Object[] { empId }, new BeanPropertyRowMapper<Employee>(Employee.class));

        return employee;
    }

    @Override
    public List<Employee> findAll() {
        List <Employee> employeeList = jdbcTemplate.query("SELECT * FROM employee", new BeanPropertyRowMapper<Employee>(Employee.class));
        return employeeList;
    }
}
