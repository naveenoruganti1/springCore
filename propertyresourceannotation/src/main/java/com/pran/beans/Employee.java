package com.pran.beans;

public class Employee {
	private int empId;
	private String empName;
	private String empSal;
	private String designation;

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", designation="
				+ designation + "]";
	}
	
}
