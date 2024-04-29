package com.mongo.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.mongodb.model.Employee;
import com.mongo.mongodb.model.Guide;
import com.mongo.mongodb.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public Guide home() {
        employeeService.save();
        Guide s = new Guide("localhost:8080/add", "localhost:8080/update/EMPLOYEE_ID",
                "localhost:8080/delete/EMPLOYEE_ID", "localhost:8080/show");
        return s;
    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.add(employee);
        return employee.getId();
    }

    @GetMapping("/show")
    public List<Employee> showEmployee(Employee employee) {
        return employeeService.show(employee);
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        System.out.println(employee.getEmployeeName());
        employeeService.update(id, employee);
        return "Employee updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable String id) {
        employeeService.delete(id);
        return "Employee deleted";
    }
}
