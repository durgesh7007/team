/*package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;

public class EmployeeService {
	
	EmployeeDAO employeeDAO = new EmployeeDAO();
	public String addEmployee(Employee employee) {
		
		//service is consumed dao method
		return employeeDAO.addEmployee(employee);
	}
	public Employee getEmployeeById(String empId) {
		return employeeDAO.getEmployeeById(empId);
		
	}
	public Employee[] getEmployees() {
		return employeeDAO.getEmployees();
		
	}
	//Assignment1
	public String deleteEmployeeById(String id) {
		return employeeDAO.deleteEmployeeById(id);
		
	}
	//delete all employees 
	public void deleteAllEmployees() {
		
		 employeeDAO.deleteAllEmployees();
	}
	//Assignment2
	public String updateEmployee(String id, Employee employee) {
		return employeeDAO.updateEmployee(id, employee);
	}
}
*/