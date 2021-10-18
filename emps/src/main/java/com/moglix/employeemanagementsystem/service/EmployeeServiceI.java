package com.moglix.employeemanagementsystem.service;

import java.util.List;

import com.moglix.employeemanagementsystem.dto.Employee;

public interface EmployeeServiceI {
	
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(String id, Employee employee);
	public Employee getEmployeeById(String id);
	public List<Employee> getEmployee();
	public String deleteEmployeeById(String id);
	public String deleteAllEmployee();
}
