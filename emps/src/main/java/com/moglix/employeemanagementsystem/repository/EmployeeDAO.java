/*package com.moglix.employeemanagementsystem.repository;

import java.util.Scanner;

import com.moglix.employeemanagementsystem.dto.Employee;

public class EmployeeDAO {
	
	private static int counter=0;
	Employee employees[] = new Employee[10];
	
	public String addEmployee(Employee employee) {
		
		if(counter<employees.length) {
			employees[counter++] = employee;
			return "success";
		}
		
		else {
			return "array is full";
		}
			
	}
	public Employee getEmployeeById(String id) {
		
		for(Employee employee : employees) {
			if(employee!=  null && id.equals(employee.getEmpID())) {
				return employee;
			}
		}
		 return null;	
	}
	public Employee[] getEmployees() {
		return employees;
		
	}
	//Assignment1
	public String deleteEmployeeById(String id) {
		for(Employee employee3 : employees) {
			if(employee3!=null && (employee3.getEmpID()).equals(id)) {
				employee3= null;
				return "Employee details Deleted";
			}
		}
		return "match not found";
		
	}
	//delete all employees
	public void deleteAllEmployees() {
		
		employees = null;
	}
	//Assignment3
	public String updateEmployee(String empId, Employee employee) {
		Scanner sc= new Scanner(System.in);
		for(Employee employee1 : employees) {
			if(employee1!=null && employee1.getEmpID().contentEquals(empId)) {
				System.out.println("--- Enter details---");
				System.out.println("Enter first name:");
				employee1.setEmpFirstName(sc.nextLine());
				System.out.println("Enter last name:");
				employee1.setEmpLastName(sc.nextLine());
				System.out.println("Enter Address:");
				employee1.setEmpAddress(sc.nextLine());
				return "Employee details updated";
			}
		}
		return "match not found";
	}
}
*/