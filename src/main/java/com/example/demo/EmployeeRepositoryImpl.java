package com.example.demo;

import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Employee findOne(String employeeId) {
		Employee e1 = new Employee();

		e1.setEmail("john.fitstikis@fistik.com");
		e1.setFullName("jonh fistikis");
		e1.setManagerEmail("managerEmail");
		e1.setId("1");
		return e1;
	}

}
