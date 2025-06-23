package com.lti.interfaceex;

public class TempEmp implements Person {
	
	private int empId;
	private String empName;
	private double noDays;
	private double perDaySal;
	
	

	public TempEmp() {
		super();
	}



	public TempEmp(int empId, String empName, double noDays, double perDaySal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.noDays = noDays;
		this.perDaySal = perDaySal;
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



	public double getNoDays() {
		return noDays;
	}



	public void setNoDays(double noDays) {
		this.noDays = noDays;
	}



	public double getPerDaySal() {
		return perDaySal;
	}



	public void setPerDaySal(double perDaySal) {
		this.perDaySal = perDaySal;
	}
	



	@Override
	public String toString() {
		return "TempEmp [empId=" + empId + ", empName=" + empName + ", noDays=" + noDays + ", perDaySal=" + perDaySal
				+ "]";
	}



	@Override
	public void calSal() {
		// TODO Auto-generated method stub
		double totSal=this.noDays*this.perDaySal;
		System.out.println("Gross Salary for Temporary Employee is "+totSal);
		
	}

}
