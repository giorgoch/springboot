package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
@RequestMapping("/employee")
public class DemoApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String sayHello() {
		return "hello spring boot ";
	}

	@RequestMapping(value = "/{employeeId}")
	public Employee get(@PathVariable String employeeId) {
		return employeeRepository.findOne(employeeId);
	}

}
