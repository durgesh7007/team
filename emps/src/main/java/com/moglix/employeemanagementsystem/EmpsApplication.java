package com.moglix.employeemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.service.EmployeeServiceI;

@SpringBootApplication
public class EmpsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(EmpsApplication.class, args);
		//EmployeeServiceI employeeServiceI = applicationContext.getBean(EmployeeServiceI.class);
		
		//String result = employeeServiceI
		//		.addEmployee(new Employee("ab003","abhi","chi", 1));
		//System.out.println(result);
		
		//Employee result1 = employeeServiceI.getEmployeeById("ab002");
		//System.out.println(result1);
		
		
		//String result2 = employeeServiceI.deleteEmployeeById("ab001");
		//System.out.println(result2);
		
		//String result3 = employeeServiceI.deleteAllEmployee();
		//System.out.println(result3);
	}

}
