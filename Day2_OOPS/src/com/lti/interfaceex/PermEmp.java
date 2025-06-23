package com.lti.interfaceex;

public class PermEmp implements Person{
	
	private int empId;
	private String empName;
	private double basicSal;
	boolean isPerm;
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	public PermEmp() {
		super();
	}
	public PermEmp(int empId, String empName, double basicSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	@Override
	public String toString() {
		return "PermEmp [empId=" + empId + ", empName=" + empName + ", basicSal=" + basicSal + "]";
	}
	@Override
	public void calSal() {
		// TODO Auto-generated method stub
		System.out.println("The Salary of Permanent Employee is "+this.basicSal);
		
	}
	
	

}
