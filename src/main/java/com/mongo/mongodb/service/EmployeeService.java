package com.mongo.mongodb.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.mongodb.model.Employee;
import com.mongo.mongodb.repo.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public String add(Employee employee) {
        String id = UUID.randomUUID().toString();
        employee.setId(id);
        employeeRepo.save(employee);
        return "Added to the data base";
    }

    public List<Employee> show(Employee employee) {
        return employeeRepo.findAll();
    }

    public void update(String id, Employee employee) {
        Optional<Employee> employeeUpdate = employeeRepo.findById(id);
        if (employeeUpdate.isPresent()) {
            Employee employee2 = employeeUpdate.get();
            employee2.setEmployeeName(employee.getEmployeeName());
            employee2.setEmail(employee.getEmail());
            employee2.setPhoneNumber(employee.getPhoneNumber());
            employee2.setProfileImage(employee.getProfileImage());
            employee2.setReportsTo(employee.getReportsTo());
            employeeRepo.save(employee2);
        }

    }

    public void delete(String id) {
        employeeRepo.deleteById(id);
    }

    public void save() {
        Employee e = employeeRepo.findByEmail("sarane1222002@gmail.com");
        System.out.println(e);
        if (e == null) {
            employeeRepo.save(new Employee(UUID.randomUUID().toString(), "Saran", "9360704186",
                    "sarane1222002@gmail.com",
                    "reported ID",
                    "https://img.freepik.com/premium-vector/avatar-portrait-young-caucasian-boy-man-round-frame-vector-cartoon-flat-illustration_551425-19.jpg"));
            employeeRepo.save(new Employee(UUID.randomUUID().toString(), "Ram", "9646xxx675", "ramxx@gmail.com",
                    "reported ID",
                    "https://img.freepik.com/premium-vector/avatar-portrait-young-caucasian-boy-man-round-frame-vector-cartoon-flat-illustration_551425-19.jpg"));
            employeeRepo.save(new Employee(UUID.randomUUID().toString(), "Raja", "6946xxx675", "rajaxx@gmail.com",
                    "reported ID",
                    "https://img.freepik.com/premium-vector/avatar-portrait-young-caucasian-boy-man-round-frame-vector-cartoon-flat-illustration_551425-19.jpg"));
        }
    }

}
