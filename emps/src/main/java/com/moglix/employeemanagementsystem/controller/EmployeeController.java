package com.moglix.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.service.EmployeeServiceI;

@RestController
@RequestMapping("/api")

public class EmployeeController {
	
	@Autowired
	EmployeeServiceI employeeServiceI;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello from durgesh";
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeServiceI.addEmployee(employee);
		//return employee;
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		
		return this.employeeServiceI.getEmployeeById(id);
		//return new Employee("5","mukesh","maurya",1000,"pqr1","lmn567","poi");
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") String id) {
		return this.employeeServiceI.deleteEmployeeById(id);
	}
	@DeleteMapping("/employeeAll")
	public String deleteAll() {
		return this.employeeServiceI.deleteAllEmployee();
 }
}
