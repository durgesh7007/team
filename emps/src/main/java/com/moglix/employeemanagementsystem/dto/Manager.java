package com.moglix.employeemanagementsystem.dto;

public class Manager extends Employee{
	
	private String projectName;
	private float projectAllowance;
	
	
	//overriding the base class method into child class
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary() + this.projectAllowance;
	}
	//setter and getter
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getProjectAllowance() {
		return projectAllowance;
	}
	public void setProjectAllowance(float projectAllowance) {
		this.projectAllowance = projectAllowance;
	}
		//default constructor
	public Manager() {
		
		super("dur12","durgesh","maurya",123.00f);// parametrized c from my base class
														// it is used to give a call to base class constructor
														// it must be a 1st call
														// it will not return anything
		System.out.println("hello from manager constructor ");
	}
	@Override
	public String toString() {
		//call super class using super keyword
		return super.toString()+"Manager [projectName=" + projectName + ", projectAllowance=" + projectAllowance + "]";
	}
	
	//generate constructor from superclass
	public Manager(String empID, String empFirstName, String empLastName, float empSalary,String projectName, float projectAllowance ) {
		
		super(empID, empFirstName, empLastName, empSalary);
		this.projectName= projectName;						//current class k object ko refer karne k liye
		this.projectAllowance= projectAllowance;
	}
}
