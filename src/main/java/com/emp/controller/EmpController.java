package com.emp.controller;

import com.emp.model.Employee;
import com.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmpController {
    @Autowired
    EmpService empService;
    @PostMapping(value = "/addEmp")
    public void addEmployee(@RequestBody Employee employee){
        empService.addEmployee(employee);
    }
    @GetMapping(value = "/allEmp")
    public List<Employee> getAllEmployee(){

        return empService.findAll();
    }
    @GetMapping(value = "/findId/{id}")
    public Employee findByEmpId(@PathVariable int id){

        return empService.find(id);
    }
}
