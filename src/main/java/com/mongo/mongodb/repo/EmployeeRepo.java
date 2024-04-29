package com.mongo.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.mongodb.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> {

    Employee findByEmail(String email);

}
