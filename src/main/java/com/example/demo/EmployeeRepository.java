package com.example.demo;
import com.example.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,String>{

	Employee findOne(String employeeId);
	

}
