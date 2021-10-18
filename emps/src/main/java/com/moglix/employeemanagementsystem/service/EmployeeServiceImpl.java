package com.moglix.employeemanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeRepository;

@Service
//@Component
public class EmployeeServiceImpl implements EmployeeServiceI {
	
	@Autowired
	EmployeeRepository employeeDAO;
	
/*	EmployeeRepository employeeDAO = EmployeeRepositoryImpl.getInstance();
	private static EmployeeServiceI employeeService;
	public static EmployeeServiceI getInstance() {
		if (employeeService == null) {
					
					employeeService = new EmployeeServiceImpl();
					return employeeService;
				}
				else 
					return employeeService;
			}	
	private EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}*/
	
	@Override
	
	public Employee addEmployee(Employee employee) {
	
			
			//service is consumed dao method
			
		Employee employee2= employeeDAO.save(employee);
		if (employee2!=null) {
			return employee2;
		} 
		else {
			return null;
		}
	}

@Override
public Employee updateEmployee(String id, Employee employee) {
	if(getEmployeeById(id)!=null)
	return addEmployee(employee);
	else
		return null;
}

@Override
public Employee getEmployeeById(String id) {
		Optional<Employee> optional = employeeDAO.findById(id);
		if (optional.isPresent()) {
			return optional.get();
			
		}
	return null;
}

@Override
public List<Employee> getEmployee() {
	
	return employeeDAO.findAll();
}

@Override
public String deleteEmployeeById(String id) {
	try {
		employeeDAO.deleteById(id);
		return "success";
	} catch (Exception e) {
		
		e.printStackTrace();
		return "fails";
	}
}

@Override
public String deleteAllEmployee() {
	employeeDAO.deleteAll();
	return "success";
	
}
}
	