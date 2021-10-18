package com.moglix.employeemanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

//orm

@Entity  //mapping orm
@Table(name="emplTable")


public /*final*/ class Employee implements Comparable<Employee>{
	
	
	@Id
	@Column(name="employee_id")
	private String empID;
	@Column
	private String empFirstName;
	
	private String empLastName;
	
	private float empSalary;
	private String empAddress;
	private String empAadhar;
	
	
	public Employee(String empID, String empFirstName, String empLastName, float empSalary) {
		super();
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
	}
	
	/*public Employee(String empID, String empFirstName, String empLastName, float empSalary, String empAddress,
			String empAadhar, String empPancard) {
		super();
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.empAadhar = empAadhar;
		this.empPancard = empPancard;
	}*/

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empSalary=" + empSalary + ", empAddress=" + empAddress + ", empAadhar=" + empAadhar
				+ ", empPancard=" + empPancard + "]";
	}
	
//	public final float calculateSalary() {
//		return 1000;
//	}
	
	
	
	// calucate emp salary
	
	
	
	/*public float calculateSalary() {
		double gsalary=getempSalary();
		double ta=(10*gsalary)/100;
		double da=(10*gsalary)/100;
		double hra=(10*gsalary)/100;
		double netsalary= hra+da+ta+gsalary;
		System.out.println(netsalary);
	}*/
	
	
	public /*final*/ float calculateSalary() {
		empSalary=this.empSalary;
		float hra=(10*empSalary)/100;
		float ta=(10*empSalary)/100;
		float da=(10*empSalary)/100;
		float netsalary=hra+ta+da+empSalary;
		return netsalary;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empAadhar == null) ? 0 : empAadhar.hashCode());
		result = prime * result + ((empAddress == null) ? 0 : empAddress.hashCode());
		result = prime * result + ((empFirstName == null) ? 0 : empFirstName.hashCode());
		result = prime * result + ((empID == null) ? 0 : empID.hashCode());
		result = prime * result + ((empLastName == null) ? 0 : empLastName.hashCode());
		result = prime * result + ((empPancard == null) ? 0 : empPancard.hashCode());
		result = prime * result + Float.floatToIntBits(empSalary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAadhar == null) {
			if (other.empAadhar != null)
				return false;
		} else if (!empAadhar.equals(other.empAadhar))
			return false;
		if (empAddress == null) {
			if (other.empAddress != null)
				return false;
		} else if (!empAddress.equals(other.empAddress))
			return false;
		if (empFirstName == null) {
			if (other.empFirstName != null)
				return false;
		} else if (!empFirstName.equals(other.empFirstName))
			return false;
		if (empID == null) {
			if (other.empID != null)
				return false;
		} else if (!empID.equals(other.empID))
			return false;
		if (empLastName == null) {
			if (other.empLastName != null)
				return false;
		} else if (!empLastName.equals(other.empLastName))
			return false;
		if (empPancard == null) {
			if (other.empPancard != null)
				return false;
		} else if (!empPancard.equals(other.empPancard))
			return false;
		if (Float.floatToIntBits(empSalary) != Float.floatToIntBits(other.empSalary))
			return false;
		return true;
	}

	public Employee() {
		System.out.println("inside the employee constructor");
	}
	public Employee(String EmpID, String EmpFirstName, String EmpLastName, Double EmpSalary, String EmpAddress,
			String EmpAadhar) {
		// TODO Auto-generated constructor stub
	}

	
	public String getEmpAadhar() {
		return empAadhar;
	}
	public void setEmpAadhar(String empAadhar) {
		this.empAadhar = empAadhar;
	}
	private String empPancard;
	public String getEmpPancard() {
		return empPancard;
	}
	public void setEmpPancard(String empPancard) {
		this.empPancard = empPancard;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public int compareTo(Employee arg0) {
		
		return this.empID.compareTo(arg0.empID);
	}
	
	
}
